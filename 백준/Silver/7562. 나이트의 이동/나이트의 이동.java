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

	static int[][] board;
	static int[][] dist;
	static int[] dx = { 1, 1, -1, -1, 2, 2, -2, -2 };
	static int[] dy = { 2, -2, 2, -2, 1, -1, 1, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			Queue<Pair> q = new LinkedList<>();
			int N = Integer.parseInt(br.readLine());
			dist = new int[N][N];
			for (int i = 0; i < N; i++) {
				Arrays.fill(dist[i], -1);
			}
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			dist[x][y] = 0;
			q.add(new Pair(x, y));
			st = new StringTokenizer(br.readLine());
			int tx = Integer.parseInt(st.nextToken());
			int ty = Integer.parseInt(st.nextToken());

			while (dist[tx][ty] == -1) {
				Pair cur = q.poll();
				for (int dir = 0; dir < 8; dir++) {
					int nx = cur.x + dx[dir];
					int ny = cur.y + dy[dir];
					if (nx < 0 || nx >= N ||  ny < 0|| ny >= N)
						continue;
					if (dist[nx][ny] >= 0)
						continue;

					dist[nx][ny] = dist[cur.x][cur.y] + 1;
					q.add(new Pair(nx,ny));
				}
			}
			System.out.println(dist[tx][ty]);
		}
	}
}
