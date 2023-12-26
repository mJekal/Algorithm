import java.util.*;
import java.io.*;

public class Main {

	static Stack<Integer> stack = new Stack<>();
	static int sum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			int k = Integer.parseInt(br.readLine());
			if (k == 0) {
				stack.pop();
			} else {
				stack.push(k);
			}
		}
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}
}