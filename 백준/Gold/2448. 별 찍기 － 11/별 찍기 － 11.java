import java.util.*;
import java.io.*;

public class Main {
	static int N, n;
	static char[][] board;

	static void solve(int x, int y, int size) {
		int half = size / 2;
		if (size == 3) {
			board[x][y] = '*';
			board[x + 1][y - 1] = board[x + 1][y + 1] = '*';
			board[x + 2][y
					- 2] = board[x + 2][y - 1] = board[x + 2][y] = board[x + 2][y + 1] = board[x + 2][y + 2] = '*';
			return;
		} else {
			solve(x, y, half);
			solve(x + half, y - half, half);
			solve(x + half, y + half, half);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		n = 2 * N - 1;
		board = new char[N][n];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = ' ';
			}
		}
		solve(0, N-1, N);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(board[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}
