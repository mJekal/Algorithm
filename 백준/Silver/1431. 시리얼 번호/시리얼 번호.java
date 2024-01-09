import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] board = new String[N];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			board[i] = s;
		}
		Arrays.sort(board, (e1, e2) -> {
			int lengthCompare = e1.length() - e2.length();

			if (lengthCompare == 0) {
				int sum1 = 0;
				int sum2 = 0;
				for (char c : e1.toCharArray()) {
					if (Character.isDigit(c)) {
						sum1 += c - '0';
					}
				}
				for (char c : e2.toCharArray()) {
					if (Character.isDigit(c)) {
						sum2 += c - '0';
					}
				}
				int sumComp = sum1 - sum2;
				if (sumComp == 0) {
					return e1.compareTo(e2);
				} else {
					return sumComp;
				}
			} else {
				return lengthCompare;
			}
		});

		for (int i = 0; i < N; i++) {
			System.out.println(board[i]);
		}
	}
}