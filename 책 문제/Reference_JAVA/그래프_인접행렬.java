import java.io.*;
import java.util.*;

public class Main {

	static int[][] adj_matrix = new int[10][10];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());

		// 방향 그래프
		for (int i = 0; i < e; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			adj_matrix[v1][v2] = 1;
			// 무방향 그래프
			// adj_matrix[v2][v1] = 1;
		}
	}
}

/* 입력
 * 
 * 5
 * 7
 * 3 1
 * 2 3
 * 4 1
 * 5 2
 * 5 4
 * 3 5
 * 2 4
 * 
 */
