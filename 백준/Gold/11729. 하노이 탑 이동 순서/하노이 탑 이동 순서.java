import java.util.*;
import java.io.*;

class Main {
	static int cnt;
	static StringBuilder sb = new StringBuilder();

	static void func(int a, int b, int N) {
		if (N == 1) {
			sb.append(a + " " + b+"\n");
			cnt++;
			return;
		}
		cnt++;
		func(a, 6 - a - b, N - 1);
		sb.append(a + " " + b + "\n");
		func(6 - a - b, b, N - 1);
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		func(1, 3, N);
		System.out.println(cnt);
		System.out.println(sb.toString());
	}
}