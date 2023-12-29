import java.util.*;
import java.io.*;

public class Main {

	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		ArrayList<Integer>[] adj = new ArrayList[N + 1];
		Queue<Integer> q = new LinkedList<>();
		boolean[] vis = new boolean[N + 1];
		for (int i = 0; i <= N; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());

			adj[v1].add(v2);
			adj[v2].add(v1);
		}

		for (int i = 1; i <= N; i++) {
			if (vis[i] == true)
				continue;
			q.add(i);
			vis[i] = true;
			count++;
			while (!q.isEmpty()) {
				int cur = q.poll();
				for (int nxt : adj[cur]) {
					if (vis[nxt] == true)
						continue;
					q.add(nxt);
					vis[nxt] = true;
				}
			}
		}
		System.out.println(count);
	}
}
