import java.util.*;
import java.io.*;

public class Main {

	static int N;
	static int[][] board;

	static class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		Pair add(Pair other) {
			return new Pair(x + other.x, y + other.y);
		}
	}

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

	static Pair solve(int offsetX, int offsetY, int size) {

		int half = size / 2;

		for (int i = offsetX; i < offsetX + size; i++) {
			for (int j = offsetY; j < offsetY + size; j++) {
				if (board[i][j] != board[offsetX][offsetY]) {
					return solve(offsetX, offsetY, half).add(solve(offsetX + half, offsetY, half))
							.add(solve(offsetX, offsetY + half, half)).add(solve(offsetX + half, offsetY + half, half));
				}
			}
		}

		if (board[offsetX][offsetY] == 1) {
			return new Pair(0, 1);
		}
		return new Pair(1, 0);
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
		Pair count = solve(0, 0, N);
		System.out.println(count.x);
		System.out.println(count.y);
	}
}
