import java.io.*;
import java.util.*;

public class Main {

	static int[] dp = new int[1001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp[2] = 2;
		dp[1] = 1;
		if(N == 1) {
			System.out.println(1);
			return;
		}
		if(N == 2) {
			System.out.println(2);
			return;
		}
		for (int i = 3; i <= N; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2])%10007;
		}
		System.out.println(dp[N]);
	}
}
