import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String ori = br.readLine();		
		int M = Integer.parseInt(br.readLine());
		
		LinkedList<Character> ori_c = new LinkedList<>();
		for(int i = 0; i < ori.length(); i++) {
			ori_c.add(ori.charAt(i));
		}
		ListIterator<Character> iter = ori_c.listIterator();
		while(iter.hasNext()) {
			iter.next();
		}
		for (int i = 0; i < M; i++) {
			String inst = br.readLine();
			switch (inst.charAt(0)) {
			case 'P':
				char tok = inst.charAt(2);
				iter.add(tok);
				break;
			case 'L':
				if (iter.hasPrevious())
					iter.previous();
				break;
			case 'D':
				if (iter.hasNext())
					iter.next();
				break;
			case 'B':
				if (iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break;
			default:
				break;
			}
		}
		for(Character chr : ori_c) {
			bw.write(chr);
		}
		bw.flush();
		bw.close(); 
	}
}