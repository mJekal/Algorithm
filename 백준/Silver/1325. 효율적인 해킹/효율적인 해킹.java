import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer>[] adj;
	static boolean[] vis;
	static Queue<Integer> q;
	static int[] ans;
	static int N;
	static int Max = Integer.MIN_VALUE;

	static void bfs(int i) {
		vis = new boolean[N + 1];
		q = new LinkedList<>();
		q.add(i);
		vis[i] = true;
		while (!q.isEmpty()) {
			int cur = q.poll();
			ans[cur]++;
			for (int nxt : adj[cur]) {
				if (vis[nxt] != false)
					continue;
				q.add(nxt);
				vis[nxt] = true;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		adj = new ArrayList[N + 1];
		ans = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			adj[i] = new ArrayList<>();
		}
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			adj[v1].add(v2);
		}

		for (int i = 1; i <= N; i++) {
			bfs(i);
		}
		for (int i = 1; i <= N; i++) {
			Max = Math.max(ans[i], Max);
		}

		for (int i = 1; i <= N; i++) {
			if (ans[i] == Max) {
				System.out.print(i + " ");
			}
		}
	}
}