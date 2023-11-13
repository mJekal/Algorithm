import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int find;
	static int[][] board;
	static int result;
	static int result2;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		find = Integer.parseInt(br.readLine());
		board = new int[N][N];

		int curX = N / 2;
		int curY = N / 2;
		int dir = 0;
		int limit = 1;
		int dis_cnt = 0;
		int dir_cnt = 0;
		for (int i = 1; i <= N * N; i++) {
			board[curX][curY] = i;
			curX += dx[dir % 4];
			curY += dy[dir % 4];
			dis_cnt++;
			if (limit == dis_cnt) {
				dir++;
				dis_cnt = 0;
				dir_cnt++;
			}
			if (dir_cnt == 2) {
				dir_cnt = 0;
				limit++;

			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(board[i][j] + " ");
				if (board[i][j] == find) {
					result = i + 1;
					result2 = j + 1;
				}
			}
			sb.append("\n");
		}
		sb.append(result + " " + result2);
		System.out.println(sb);
		br.close();
	}
}
