import java.util.*;
import java.io.*;

public class Main {
	static LinkedList<Character> list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int i = 0; i < tc; i++) {
			list = new LinkedList<>();
			ListIterator<Character> iter = list.listIterator();
			String s = br.readLine();
			for (char c : s.toCharArray()) {
				switch (c) {
				case '<':
					if (iter.hasPrevious()) {
						iter.previous();
					}
					break;
				case '>':
					if (iter.hasNext()) {
						iter.next();
					}
					break;
				case '-':
					if (iter.hasPrevious()) {
						iter.previous();
						iter.remove();
					}
					break;
				default:
					iter.add(c);
				}
			}
			StringBuilder sb = new StringBuilder();
            for(char c : list) {
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
	}
}
