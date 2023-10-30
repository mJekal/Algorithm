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
	static int n;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	static void bfs(int i, int j) {
		Queue<Pair> Q = new LinkedList<>();
		Q.add(new Pair(i, j));
		vis[i][j] = true;
		while (!Q.isEmpty()) {
			Pair cur = Q.poll();
			for (int dir = 0; dir < 4; dir++) {
				int nx = cur.x + dx[dir];
				int ny = cur.y + dy[dir];
				if (nx < 0 || nx >= n || ny < 0 || ny >= n)
					continue;
				if (vis[nx][ny] || board[i][j] != board[nx][ny])
					continue;
				vis[nx][ny] = true;
				Q.add(new Pair(nx, ny));
			}
		}
	}

	static int area() {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!vis[i][j]) {
					cnt++;
					bfs(i, j);
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		board = new char[n][n];
		vis = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String row = br.readLine();
			for (int j = 0; j < n; j++) {
				board[i][j] = row.charAt(j);
			}
		}

		int not = area();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				vis[i][j] = false;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 'G') {
					board[i][j] = 'R';
				}
			}
		}

		int is = area();

		System.out.println(not + " " + is);
	}

}

