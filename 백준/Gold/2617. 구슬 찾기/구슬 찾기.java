import java.util.*;
import java.io.*;

public class Main {

	static boolean[] vis;
	static ArrayList<Integer>[] adjW;
	static ArrayList<Integer>[] adjF;
	static int cnt;
	static int N;
	static Queue<Integer> q;

	static boolean bfs(int i, ArrayList<Integer>[] adj) {
		q = new LinkedList<>();
		Arrays.fill(vis, false);
		int dist = 0;
		q.add(i);
		vis[i] = true;
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int nxt : adj[cur]) {
				if (vis[nxt] == true)
					continue;
				q.add(nxt);
				dist++;
				vis[nxt] = true;
			}
		}
		return dist >= (N + 1) / 2;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		adjW = new ArrayList[N + 1];
		adjF = new ArrayList[N + 1];
		vis = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			adjW[i] = new ArrayList<>();
			adjF[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());

			adjW[v2].add(v1);
			adjF[v1].add(v2);
		}

		for (int i = 1; i <= N; i++) {
			if (bfs(i, adjW)) {
				cnt++;
			}
			if (bfs(i, adjF)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
