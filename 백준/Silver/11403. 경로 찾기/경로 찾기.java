import java.util.*;
import java.io.*;

public class Main {

	static ArrayList<Integer>[] adj;
	static boolean[] vis;
	static Queue<Integer> q;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		adj = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<>();
		}
		int[][] board = new int[N][N];
		vis = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 1; j <= N; j++) {
				int k = Integer.parseInt(st.nextToken());
				if (k == 1) {
					adj[i].add(j);
				}
			}
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				q = new LinkedList<>();
				Arrays.fill(vis, false);
				q.add(i);
				vis[i] = true;
				while (!q.isEmpty()) {
					int cur = q.poll();
					for (int nxt : adj[cur]) {
						if (nxt == j) {
							board[i - 1][j - 1] = 1;
							break;
						}
						if (vis[nxt] == true)
							continue;

						q.add(nxt);
						vis[nxt] = true;
					}
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}