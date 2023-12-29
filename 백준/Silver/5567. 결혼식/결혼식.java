import java.util.*;
import java.io.*;

public class Main {

	static ArrayList<Integer>[] adj;
	static boolean[] vis;
	static Stack<Integer> s;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		adj = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<>();
		}

		vis = new boolean[N + 1];

		s = new Stack<>();

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());

			adj[v1].add(v2);
			adj[v2].add(v1);
		}

		s.push(1);

		while (!s.isEmpty()) {
			int cur = s.pop();
			vis[cur] = true;
			for (int nxt : adj[cur]) {
				if (vis[nxt] == true)
					continue;
				vis[nxt] = true;
				cnt++;
				if(cur==1) s.add(nxt);	
			}
		}
		System.out.println(cnt);
	}
}