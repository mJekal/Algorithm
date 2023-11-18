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

	static int[][] dist;
	static int N, T;
	static int nn, mm;
	static int[] dx = { 1, 1, -1, -1, 2, 2, -2, -2 };
	static int[] dy = { 2, -2, 2, -2, 1, -1, 1, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			N = Integer.parseInt(br.readLine());
			dist = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					dist[i][j] = -1;
				}
			}
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			dist[n][m] = 0;
			Queue<Pair> q = new LinkedList<>();
			q.add(new Pair(n, m));
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			nn = Integer.parseInt(st1.nextToken());
			mm = Integer.parseInt(st1.nextToken());

			while (!q.isEmpty()) {
				Pair cur = q.poll();
				for (int dir = 0; dir < 8; dir++) {
					int nx = dx[dir] + cur.x;
					int ny = dy[dir] + cur.y;
					if (nx < 0 || nx >= N || ny < 0 || ny >= N)
						continue;
					if (dist[nx][ny] >= 0)
						continue;
					dist[nx][ny] = dist[cur.x][cur.y] + 1;
					q.add(new Pair(nx, ny));
				}
			}
			System.out.println(dist[nn][mm]);
		}
	}
}