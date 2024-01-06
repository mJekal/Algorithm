import java.util.*;
import java.io.*;

public class Main {

	static int N, M;
	static int[] arr;
	static boolean[] isUsed;

	static void func(int k) {
		if (k == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (!isUsed[i]) {
				arr[k] = i;
				isUsed[i] = true;
				func(k + 1);
				isUsed[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		isUsed = new boolean[N + 1];
		func(0);
	}
}