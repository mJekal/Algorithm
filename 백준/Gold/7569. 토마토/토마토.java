import java.util.*;
import java.io.*;

public class Main {
	static class Pair {
		int x, y, z;

		Pair(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	static int[][][] board;
	static int[][][] dist;
	static int[] dx = { 1, 0, -1, 0, 0, 0 };
	static int[] dy = { 0, 1, 0, -1, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, 1, -1 };
	static int max = Integer.MIN_VALUE;
	static Queue<Pair> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		board = new int[N][M][K];
		dist = new int[N][M][K];
		for (int k = 0; k < K; k++) {
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					board[i][j][k] = Integer.parseInt(st.nextToken());
					if (board[i][j][k] == 0) {
						dist[i][j][k] = -1;
					}
					if (board[i][j][k] == 1) {
						q.add(new Pair(i, j, k));
					}
				}
			}
		}

		while (!q.isEmpty()) {
			Pair cur = q.poll();
			for (int dir = 0; dir < 6; dir++) {
				int nx = cur.x + dx[dir];
				int ny = cur.y + dy[dir];
				int nz = cur.z + dz[dir];

				if (nx < 0 || nx >= N || ny < 0 || ny >= M || nz < 0 || nz >= K)
					continue;
				if (board[nx][ny][nz] != 0 || dist[nx][ny][nz] >= 0)
					continue;

				dist[nx][ny][nz] = dist[cur.x][cur.y][cur.z] + 1;
				q.add(new Pair(nx, ny, nz));
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < K; k++) {
					if (dist[i][j][k] == -1) {
						System.out.println("-1");
						return;
					}
					max = Math.max(max, dist[i][j][k]);
				}
			}
		}
		System.out.println(max);
	}
}

