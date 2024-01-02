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
			if (dist[j] > val) {
				val = dist[j];
			}
		}

		if (val == 0) {
			return 100;
		} else {
			return val;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		adj = new ArrayList[N + 1];
		arr = new ArrayList<>();
		ans = new ArrayList<>();
		dist = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			adj[i] = new ArrayList<>();
		}
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if (K == -1 && M == -1)
				break;
			adj[K].add(M);
			adj[M].add(K);
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
			if (k < min) {
				min = k;
			}
		}

		for (int i = 0; i < N; i++) {
			if (min == arr.get(i)) {
				ans.add(i + 1);
			}
		}
		System.out.println(min + " " + ans.size());
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
	}
}