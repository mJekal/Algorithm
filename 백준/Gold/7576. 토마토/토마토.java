import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int M;
	static int[][] board;
	static int[][] dist;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int max = Integer.MIN_VALUE;

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		board = new int[N][M];
		dist = new int[N][M];
		Queue<Pair> q = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				dist[i][j] = -1;
				if (board[i][j] == -1) {
					dist[i][j] = -2;
				}
				if (board[i][j] == 1) {
					dist[i][j] = 0;
					q.add(new Pair(i, j));
				}
			}
		}

		while (!q.isEmpty()) {
			Pair cur = q.poll();
			for (int dir = 0; dir < 4; dir++) {
				int nx = cur.x + dx[dir];
				int ny = cur.y + dy[dir];
				if (nx < 0 || nx >= N || ny < 0 || ny >= M)
					continue;
				if (board[nx][ny] != 0 || dist[nx][ny] != -1)
					continue;
				dist[nx][ny] = dist[cur.x][cur.y] + 1;
				q.add(new Pair(nx, ny));
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (dist[i][j] == -1) {
					System.out.println(-1);
					return;
				}
				max = Math.max(dist[i][j], max);
			}
		}

		System.out.println(max);
	}
}