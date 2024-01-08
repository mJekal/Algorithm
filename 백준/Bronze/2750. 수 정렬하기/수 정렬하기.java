import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		board = new int[N];
		for (int i = 0; i < N; i++) {
			board[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1 - i; j++) {
				if (board[j] > board[j + 1]) {
					int temp = board[j+1];
					board[j + 1] = board[j];
					board[j] = temp;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(board[i]);
		}
	}
}
