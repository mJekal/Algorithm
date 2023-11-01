import java.io.*;
import java.util.*;


public class Main{

	static int N, M, B, min, max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		int[][] board = new int[N][M];

		max = 0;
		min = 256;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				if (max < board[i][j]) {
					max = board[i][j];
				}
				if (min > board[i][j]) {
					min = board[i][j];
				}
			}

		}
		int mmin = 2147483647;
		int height = 0;
		for (int i = min; i <= max; i++) {
			int time = 0;
			int block = B;
			for (int n = 0; n < N; n++) {
				for (int m = 0; m < M; m++) {
					if (board[n][m] > i) {
						time += 2 * (board[n][m] - i);
						block += (board[n][m] - i);

					} 
                    if (board[n][m] < i) {
						time += (i-board[n][m]);
						block -= (i-board[n][m]);
					}
				}
			}
			if (block < 0)
				break;
			if (mmin >= time) {
				mmin = time;
				height = i;
			}

		}
		System.out.println(mmin + " " + height);
	}
}