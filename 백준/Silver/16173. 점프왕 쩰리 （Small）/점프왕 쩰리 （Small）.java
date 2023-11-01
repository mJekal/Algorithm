

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

	static int[] dx = { 0, 1 };
	static int[] dy = { 1, 0 };
	static int[][] board;
	static boolean[][] vis;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		board = new int[N][N];
		vis = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				vis[i][j] = false;
			}
		}
		Queue<Pair> Q = new LinkedList<>();
		vis[0][0] = true;
		Q.add(new Pair(0, 0));

		while (!Q.isEmpty()) {
			Pair cur = Q.poll();
	if (board[cur.x][cur.y] == -1) {
						System.out.println("HaruHaru");
						return;}

				for (int dir = 0; dir < 2; dir++) {
					int nx = cur.x + dx[dir] * board[cur.x][cur.y];
					int ny = cur.y + dy[dir] * board[cur.x][cur.y];

					if (nx < 0 || nx >= N || ny < 0 || ny >= N)
						continue;
					if (vis[nx][ny])
						continue;
					vis[nx][ny] = true;
					Q.add(new Pair(nx, ny));

				}
			}
			System.out.println("Hing");
		}
	}

