import java.util.*;
import java.io.*;

public class Main {

	static ArrayList<Integer>[] adj;
	static boolean[] vis;
	static Queue<Integer> q;
	static int[] dist;
	static int N;
	static ArrayList<Integer> arr;
	static ArrayList<Integer> ans;
	static int min = Integer.MAX_VALUE;

	static int bfs(int i) {
		Arrays.fill(dist, -1);
		q = new LinkedList<>();
		q.add(i);
		dist[i] = 0;
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int nxt : adj[cur]) {
				if (dist[nxt] != -1)
					continue;
				q.add(nxt);
				dist[nxt] = dist[cur] + 1;
			}
		}
		int val = 0;
		for (int j = 1; j <= N; j++) {
			val += dist[j];
		}
		return val;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		adj = new ArrayList[N + 1];
		arr = new ArrayList<>();
		dist = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			adj[i] = new ArrayList<>();
		}
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			adj[v1].add(v2);
			adj[v2].add(v1);
		}

		for (int i = 1; i <= N; i++) {
			int k = bfs(i);
			arr.add(k);
			if (k < min) {
				min = k;
			}
		}
		for (int i = 1; i <= N; i++) {
			int k = bfs(i);
			arr.add(k);
			if (min > k) {
				min = k;
			}
		}

		for (int i = 0; i < N; i++) {
			if (min == arr.get(i)) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}