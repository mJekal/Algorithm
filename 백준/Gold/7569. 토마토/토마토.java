import java.util.*;
import java.io.*;

public class Main {

	static int max = Integer.MIN_VALUE;
	static int N, M, H;
	static int[][][] board;
	static int[][][] dist;
	static int[] dx = { 1, 0, -1, 0, 0, 0 };
	static int[] dy = { 0, 1, 0, -1, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, 1, -1 };

	static class Pair {
		int x, y, z;

		Pair(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	static Queue<Pair> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());

		board = new int[N][M][H];
		dist = new int[N][M][H];

		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					board[i][j][k] = Integer.parseInt(st.nextToken());
					dist[i][j][k] = -1;
					if (board[i][j][k] == -1) {
						dist[i][j][k] = 0;
					}
					if (board[i][j][k] == 1) {
						dist[i][j][k] = 0;
						q.add(new Pair(i, j, k));
					}
				}
			}
		}

		while (!q.isEmpty()) {
			Pair cur = q.poll();
			for (int dir = 0; dir < 6; dir++) {
				int nx = dx[dir] + cur.x;
				int ny = dy[dir] + cur.y;
				int nz = dz[dir] + cur.z;

				if (nx < 0 || nx >= N || ny < 0 || ny >= M || nz < 0 || nz >= H)
					continue;
				if (dist[nx][ny][nz] >= 0)
					continue;

				dist[nx][ny][nz] = dist[cur.x][cur.y][cur.z] + 1;
				q.add(new Pair(nx, ny, nz));
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < H; k++) {
					if (dist[i][j][k] == -1) {
						System.out.println(-1);
						return;
					}
					max = Math.max(max, dist[i][j][k]);
				}
			}
		}
		System.out.println(max);
	}
}