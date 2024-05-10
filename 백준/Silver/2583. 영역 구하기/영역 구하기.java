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
	static int area = 0;

	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { -1, 0, 1, 0 };
	static int mx = -1;
	static int[][] board;
	static boolean[][] vis;
	static int M, N, K;
	static Queue<Pair> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		board = new int[N][M];
		vis = new boolean[N][M];
		List<Integer> a = new LinkedList<>();
		for (int tc = 0; tc < K; tc++) {
			st = new StringTokenizer(br.readLine());
			int k1 = Integer.parseInt(st.nextToken());
			int k2 = Integer.parseInt(st.nextToken());
			int k3 = Integer.parseInt(st.nextToken());
			int k4 = Integer.parseInt(st.nextToken());
			cnt = 0;
			for (int i = k1; i < k3; i++) {
				for (int j = k2; j < k4; j++) {
					board[N - j - 1][i] = 1;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (board[i][j] == 1 || vis[i][j] == true)
					continue;
				vis[i][j] = true;
				cnt++;
				area = 0;
				q.add(new Pair(i, j));
				while (!q.isEmpty()) {
					Pair cur = q.poll();
					area++;
					for (int dir = 0; dir < 4; dir++) {
						int nx = cur.x + dx[dir];
						int ny = cur.y + dy[dir];
						if (nx < 0 || nx >= N || ny < 0 || ny >= M)
							continue;
						if (board[nx][ny] == 1 || vis[nx][ny] == true)
							continue;
						vis[nx][ny] = true;
						q.add(new Pair(nx, ny));
					}
				}
				a.add(area);
			}

		}
		Collections.sort(a);
		for (int i = 0; i < a.size(); i++) {
			sb.append(a.get(i));
			sb.append(" ");
		}
		System.out.println(cnt);
		System.out.println(sb);
	}

}
