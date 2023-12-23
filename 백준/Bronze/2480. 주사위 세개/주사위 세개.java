import java.util.*;
import java.io.*;

public class Main {
	static int award;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		if (A == B && B == C) {
			award = 10000 + A * 1000;
		}
		if (A == B && B != C || A == C && B != C) {
			award = 1000 + A * 100;
		}
		if (C == B && B != A) {
			award = 1000 + B * 100;
		}
		if (A != B && B != C && A != C) {
			int[] arr = { A, B, C };
			Arrays.sort(arr);
			award = arr[2] * 100;
		}
		System.out.println(award);
	}
}
