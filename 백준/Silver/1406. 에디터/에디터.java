import java.util.*;
import java.io.*;

public class Main {
	static LinkedList<Character> editor = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		for (char c : s.toCharArray()) {
			editor.add(c);
		}
		ListIterator<Character> cursor = editor.listIterator();
		while (cursor.hasNext()) {
			cursor.next();
		}
		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			String inst = br.readLine();
			switch (inst.charAt(0)) {
			case 'P':
				cursor.add(inst.charAt(2));
				break;
			case 'L':
				if (cursor.hasPrevious())
					cursor.previous();
				break;
			case 'D':
				if (cursor.hasNext())
					cursor.next();
				break;
			case 'B':
				if (cursor.hasPrevious()) {
					cursor.previous();
					cursor.remove();
				}
				break;
			}
		}
		for (char c : editor) {
			bw.write(c);
		}
		bw.flush();
		bw.close();
	}
}
