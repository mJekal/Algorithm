import java.io.*;
import java.util.*;

public class Main {

	static int[] dp = new int[1000001];
	static int mn;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp[1] = 0;
		for (int i = 2; i <= N; i++) {
			mn = Integer.MAX_VALUE;
			if (i % 3 == 0) {
				mn = Math.min(dp[i / 3] + 1, mn);
			}
			if (i % 2 == 0) {
				mn = Math.min(dp[i / 2] + 1, mn);
			}
			mn = Math.min(dp[i - 1] + 1, mn);
			dp[i] = mn;
		}
		System.out.println(dp[N]);
	}
}