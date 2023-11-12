import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static int[] arr;
	static boolean[] vis;

	static void backtracking(int k, int idx) {
		if (k == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = idx; i <= N; i++) {
			arr[k] = i;
			backtracking(k + 1, i);

		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		vis = new boolean[N+1];
		
		backtracking(0,1);

	}
}
