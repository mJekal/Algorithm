import java.util.*;
import java.io.*;

public class Main {

	static int N;
	static int[][] board;
	static int[] count;

	static boolean check(int offsetX, int offsetY, int size) {
		for (int i = offsetX; i < offsetX + size; i++) {
			for (int j = offsetY; j < offsetY + size; j++) {
				if (board[i][j] != board[offsetX][offsetY]) {
					return false;
				}
			}
		}
		return true;
	}

	static void solve(int offsetX, int offsetY, int size) {

		int half = size / 3;

		if (check(offsetX, offsetY, size)) {
			count[board[offsetX][offsetY] + 1] += 1;
			return;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				solve(offsetX + i * half, offsetY + j * half, half);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		board = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		count = new int[3];
		solve(0, 0, N);
		for (int i = 0; i < 3; i++) {
			System.out.println(count[i]);
		}
	}
}
