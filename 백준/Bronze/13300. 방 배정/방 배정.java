import java.util.*;
import java.io.*;

public class Main {

	static int[][] mem = new int[6][2];
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
			mem[year - 1][sex]++;
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				if (mem[i][j] != 0) {
					cnt++;
				}
				if (mem[i][j] > K) {
					cnt += mem[i][j] / K;
				}

			}
		}
		System.out.print(cnt);
	}
}
