import java.util.*;
import java.io.*;

public class Main {

	static boolean[] vis;
	static ArrayList<Integer>[] adj;
	static int[] check;
	static boolean isBip;

	static void dfs(int cur) {
		vis[cur] = true;
		for (int nxt : adj[cur]) {
			if (vis[nxt] == true) {
				if (check[nxt] == check[cur]) {
					isBip = false;
				}
			} else {
				check[nxt] = 1 - check[cur];
				dfs(nxt);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());
		while (TC-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			isBip = true;
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			adj = new ArrayList[N + 1];
			vis = new boolean[N + 1];
			check = new int[N + 1];
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
				if (isBip) {
					dfs(i);
				} else {
					break;
				}
			}
			if (isBip) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}