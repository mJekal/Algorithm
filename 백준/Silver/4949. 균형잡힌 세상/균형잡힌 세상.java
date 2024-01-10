import java.io.*;
import java.util.*;

public class Main {
	static Stack stack = new Stack<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String ss = br.readLine();
			if (ss.charAt(0) == '.') {
				return;
			}
			StringTokenizer st = new StringTokenizer(ss);
			boolean no = false;
			boolean fin = false;
			Stack stack = new Stack<>();
			while (true) {
				String s = st.nextToken();
				for (char c : s.toCharArray()) {
					if (c == '(' || c == '[') {
						stack.add(c);
					}
					if (c == ')') {
						if (stack.isEmpty()) {
							no = true;
							break;
						}
						if (!stack.peek().equals('(')) {
							no = true;
							break;
						} else {
							stack.pop();
						}
					}
					if (c == ']') {
						if (stack.isEmpty()) {
							no = true;
							break;
						}
						if (!stack.peek().equals('[')) {
							no = true;
							break;
						} else {
							stack.pop();
						}
					}
					if (c == '.') {
						fin = true;
						break;
					}
				}
				if (fin == true || no == true) {
					break;
				}
			}
			if (!stack.isEmpty()) {
				no = true;
			}
			if (no == false) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}