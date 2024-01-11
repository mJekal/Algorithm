import java.io.*;
import java.util.*;

public class Main {

	static int[][] dp = new int[10001][3];
	static int[] S = new int[10001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			int k = Integer.parseInt(br.readLine());
			S[i] = k;
		}
		if (N == 1) {
			System.out.println(S[1]);
			return;
		}
		dp[1][1] = S[1];
		dp[1][2] = 0;
		dp[2][1] = S[2];
		dp[2][2] = S[1] + S[2];
		for (int i = 3; i <= N; i++) {
			dp[i][1] = Math.max(dp[i - 2][1], dp[i - 2][2]) + S[i];
			dp[i][2] = dp[i - 1][1] + S[i];
		}
		System.out.println(Math.max(dp[N][1], dp[N][2]));
	}
}
