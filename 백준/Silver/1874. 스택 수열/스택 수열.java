import java.util.*;
import java.io.*;

public class Main {

	static Stack<Integer> stack = new Stack<>();
	static int cnt = 1;
	static boolean isNO;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < N; tc++) {
			int cur = Integer.parseInt(br.readLine());
			while (cnt <= cur) {
				stack.push(cnt++);
				sb.append("+\n");
			}
			if (stack.peek() != cur) {
				System.out.println("NO");
				isNO = true;
				break;
			}
			stack.pop();
			sb.append("-\n");
		}
		if (!isNO)
			System.out.println(sb);
	}
}