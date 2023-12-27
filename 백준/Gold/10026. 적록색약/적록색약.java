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

	static char[][] board;
	static boolean[][] vis;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int N;
	static int cnt;

	static int bfs() {
		cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (vis[i][j] == true)
					continue;
				cnt++;
				Queue<Pair> q = new LinkedList<>();
				vis[i][j] = true;
				q.add(new Pair(i, j));
				while (!q.isEmpty()) {
					Pair cur = q.poll();
					for (int dir = 0; dir < 4; dir++) {
						int nx = cur.x + dx[dir];
						int ny = cur.y + dy[dir];
						if (nx < 0 || nx >= N || ny < 0 || ny >= N)
							continue;
						if (board[i][j] != board[nx][ny] || vis[nx][ny] == true)
							continue;
						vis[nx][ny] = true;
						q.add(new Pair(nx, ny));
					}
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		board = new char[N][N];
		vis = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				board[i][j] = str.charAt(j);
			}
		}
		System.out.println(bfs());
		for (int i = 0; i < N; i++) {
			Arrays.fill(vis[i], false);
			for (int j = 0; j < N; j++) {
				if (board[i][j] == 'G') {
					board[i][j] = 'R';
				}
			}
		}
		System.out.println(bfs());
	}
}
