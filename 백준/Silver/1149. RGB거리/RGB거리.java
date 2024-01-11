import java.io.*;
import java.util.*;

public class Main {

	static int[][] dp = new int[10001][3];
	static int[][] S = new int[10001][3];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= 2; j++) {
				int k = Integer.parseInt(st.nextToken());
				S[i][j] = k;
			}
		}

		dp[1][0] = S[1][0];
		dp[1][1] = S[1][1];
		dp[1][2] = S[1][2];

		for (int i = 2; i <= N; i++) {
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + S[i][0];
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + S[i][1];
			dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][0]) + S[i][2];
		}
		System.out.println(Math.min(Math.min(dp[N][1], dp[N][2]), dp[N][0]));
	}
}
