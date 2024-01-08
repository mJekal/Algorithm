import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static char[][] board;

	static void solve(int x, int y, int size) {
		int half = size / 3;
		if (size == 1) {
			board[x][y] = '*';
			return;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1) {
					continue;
				}
				solve(x + half * i, y + half * j, half);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		board = new char[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = ' ';
			}
		}
		solve(0, 0, N);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(board[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}
