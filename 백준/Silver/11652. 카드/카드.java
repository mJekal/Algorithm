import java.io.*;
import java.util.*;

public class Main {

	static int cnt = 0;
	static long mxval = -(1L << 62) - 1;
	static int mxcnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] board = new long[100005];
		for (int i = 0; i < N; i++) {
			long k = Long.parseLong(br.readLine());
			board[i] = k;
		}
		Arrays.sort(board, 0, N);
		for (int i = 0; i < N; i++) {
			if (i == 0 || board[i] == board[i - 1]) {
				cnt++;
			} else {
				if (cnt > mxcnt) {
					mxcnt = cnt;
					mxval = board[i - 1];
				}
				cnt = 1;
			}
		}
		if (cnt > mxcnt) {
			mxval = board[N - 1];
		}

		System.out.println(mxval);
	}
}