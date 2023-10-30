import java.util.*;
import java.io.*;

public class Main {
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());

			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			Queue<Pair> Q = new LinkedList<>();

			int[][] board = new int[M][N];
			int[][] dist = new int[M][N];

			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					board[i][j] = 0;
					dist[i][j] = -1;
				}
			}

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int I = Integer.parseInt(st.nextToken());
				int J = Integer.parseInt(st.nextToken());
				board[I][J] = 1;
			}

			int cnt = 0;
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (board[i][j] == 0 || dist[i][j] != -1) continue;
						dist[i][j] = 0;
						Q.add(new Pair(i, j));

						while (!Q.isEmpty()) {
							Pair cur = Q.poll();
							for (int dir = 0; dir < 4; dir++) {
								int nx = cur.x + dx[dir];
								int ny = cur.y + dy[dir];

								if (nx < 0 || nx >= M || ny < 0 || ny >= N)
									continue;
								if (board[nx][ny] != 1 || dist[nx][ny] != -1)
									continue;

								dist[nx][ny] = dist[cur.x][cur.y] + 1;
								Q.add(new Pair(nx, ny));
							}
						}
                        
					
					cnt++;
				}
			}

			System.out.println(cnt);

		}
	}

}