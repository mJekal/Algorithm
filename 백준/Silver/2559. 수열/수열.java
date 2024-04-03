import java.io.*;
import java.util.*;

public class Main {
	static int[] A;
	static int[] psum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		A = new int[n];
		psum = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(st.nextToken());
			A[i] = k;
		}
		for (int i = 1; i <= n; i++) {
			psum[i] = psum[i - 1] + A[i-1];
		}
		int mx = Integer.MIN_VALUE;
		for (int i = m; i <= n; i++) {
			mx = Math.max(mx, psum[i] - psum[i - m]);
		}
		System.out.print(mx);
	}
}
