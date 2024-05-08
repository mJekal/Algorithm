import java.io.*;
import java.util.*;

public class Main {

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int cnt = 0;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { -1, 0, 1, 0 };
	static int mx = -1;

	static int[][] board;
	static boolean[][] vis;
	static int N;

	static int countArea(int h) {
		vis = new boolean[N][N];
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!vis[i][j] && board[i][j] > h) {
					count++;
					bfs(i, j, h);
				}
			}
		}
		return count;
	}

	static void bfs(int cX, int cY, int h) {
		Queue<Pair> q = new LinkedList<>();

		q.add(new Pair(cX, cY));
		vis[cX][cY] = true;
		while (!q.isEmpty()) {
			Pair cur = q.poll();
			for (int dir = 0; dir < 4; dir++) {
				int nx = cur.x + dx[dir];
				int ny = cur.y + dy[dir];
				if (nx < 0 || nx >= N || ny < 0 || ny >= N)
					continue;
				if (vis[nx][ny] || board[nx][ny] <= h)
					continue;
				vis[nx][ny] = true;
				q.add(new Pair(nx, ny));
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				mx = Math.max(mx, board[i][j]);
			}
		}
		int MA = 0;
		for (int tc = 0; tc <= mx; tc++) {
			int mx2 = countArea(tc);
			if (mx2 > MA) {
				MA = mx2;
			}
		}
		System.out.println(MA);
	}
}
