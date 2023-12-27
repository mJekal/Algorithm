import java.util.*;
import java.io.*;

public class Main {
	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			Queue<Pair> q = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] board = new int[M][N];
			boolean[][] vis = new boolean[M][N];
			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int k = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				board[k][m] = 1;
			}

			for (int I = 0; I < M; I++) {
				for (int J = 0; J < N; J++) {
					if (vis[I][J] == true || board[I][J] != 1)
						continue;
					vis[I][J] = true;
					q.add(new Pair(I, J));
					cnt++;
					while (!q.isEmpty()) {
						Pair cur = q.poll();
						for (int dir = 0; dir < 4; dir++) {
							int nx = cur.x + dx[dir];
							int ny = cur.y + dy[dir];

							if (nx < 0 || nx >= M || ny < 0 || ny >= N)
								continue;
							if (vis[nx][ny] == true || board[nx][ny] != 1)
								continue;

							vis[nx][ny] = true;
							q.add(new Pair(nx, ny));
						}
					}

				}
			}
			sb.append(cnt);
			sb.append("\n");
			cnt = 0;
		}
		System.out.println(sb);
	}
}
