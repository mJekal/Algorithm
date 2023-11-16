import java.util.*;
import java.io.*;

public class Main {
	static boolean isPrime(int n) {
		for (int j = 2; j < n; j++) {
			if (n % j == 0)
				return false;
		}
		return true;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if (1 == n)
				continue;
			if (!isPrime(n))
				continue;
			cnt++;
		}
		System.out.println(cnt);
	}
}