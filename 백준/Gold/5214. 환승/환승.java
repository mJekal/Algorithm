import java.util.*;
import java.io.*;

public class Main {

	static ArrayList<Integer>[] adj;
	static int[] dist;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		adj = new ArrayList[N + M + 1];

		for (int i = 1; i <= N + M; i++) {
			adj[i] = new ArrayList<>();
		}

		dist = new int[N + M + 1];
		Arrays.fill(dist, -1);

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < K; j++) {
				int v = Integer.parseInt(st.nextToken());
				adj[i + N].add(v);
				adj[v].add(i + N);
			}
		}

		Queue<Integer> q = new LinkedList<>();

		q.add(1);
		dist[1] = 0;

		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int nxt : adj[cur]) {
				if (dist[nxt] != -1)
					continue;
				q.add(nxt);
				dist[nxt] = dist[cur] + 1;
			}
		}
		if (dist[N] == -1) {
			System.out.println(-1);
		} else {
			System.out.println(dist[N] / 2 + 1);
		}
	}
}