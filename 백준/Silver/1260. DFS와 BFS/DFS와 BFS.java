import java.util.*;
import java.io.*;

public class Main {

	static ArrayList<Integer>[] adj;
	static boolean[] vis;

	static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		q.add(V);
		vis[V] = true;
		while (!q.isEmpty()) {
			int cur = q.poll();
			System.out.print(cur + " ");
			for (int nxt : adj[cur]) {
				if (vis[nxt] == true)
					continue;
				q.add(nxt);
				vis[nxt] = true;

			}
		}
	}

	static void dfs(int V) {
		Stack<Integer> s = new Stack<>();
		s.push(V);
		while (!s.isEmpty()) {
			int cur = s.pop();
			if (vis[cur] == true)
				continue;
			vis[cur] = true;
			System.out.print(cur + " ");
			for (int i = 0; i < adj[cur].size(); i++) {
				int nxt = adj[cur].get(adj[cur].size() - 1 - i);
				if (vis[nxt] == true)
					continue;
				s.push(nxt);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		adj = new ArrayList[N + 1];
		vis = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());

			adj[v1].add(v2);
			adj[v2].add(v1);
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(adj[i]);
		}

		dfs(V);
		System.out.println();
		Arrays.fill(vis, false);
		bfs(V);
	}
}
