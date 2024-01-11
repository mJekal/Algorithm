import java.io.*;
import java.util.*;

public class Main {

	static int[] dp = new int[12];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int k = Integer.parseInt(br.readLine());
			for (int j = 4; j <= k; j++) {
				dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
			}
			System.out.println(dp[k]);
		}
	}
}