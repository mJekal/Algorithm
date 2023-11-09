import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static int[] arr;
	static StringBuilder sb;

	static void back(int k) {
		if (k == M) {
			for (int i = 0; i < M; i++)
				sb.append(arr[i] + " ");
			sb.append('\n');
			return;
		}

		for (int i = 1; i <= N; i++) {
			arr[k] = i;
			back(k + 1);
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		sb = new StringBuilder();
		arr = new int[M];
		back(0);
		System.out.print(sb);
	}
}