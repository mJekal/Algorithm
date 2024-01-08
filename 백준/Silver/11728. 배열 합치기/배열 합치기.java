import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static int[] A, B, board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		A = new int[N];
		B = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		int indexA = 0;
		int indexB = 0;
		for (int i = 0; i < N + M; i++) {
			if (indexA == N) {
				sb.append(B[indexB++] + " ");
			} else if (indexB == M) {
				sb.append(A[indexA++] + " ");
			} else if (A[indexA] <= B[indexB]) {
				sb.append(A[indexA++] + " ");
			} else {
				sb.append(B[indexB++] + " ");
			}
		}
		System.out.print(sb.toString());
	}
}
