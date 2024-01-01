import java.util.*;
import java.io.*;

public class Main {

	static ArrayList<Integer>[] adj;
	static boolean[] isTrue;
	static ArrayList<Integer>[] pt;
	static int cnt;
	static boolean istrue;
	static Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());

		adj = new ArrayList[N + 1];
		pt = new ArrayList[M + 1];
		isTrue = new boolean[N + 1];

		for (int i = 0; i < K; i++) {
			int t = Integer.parseInt(st.nextToken());
			isTrue[t] = true;
		}

		for (int i = 1; i < N + 1; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 1; i < M + 1; i++) {
			pt[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			pt[i + 1].add(k);
			for (int j = 0; j < n - 1; j++) {
				int p = Integer.parseInt(st.nextToken());
				pt[i + 1].add(p);
				adj[k].add(p);
				adj[p].add(k);
				int temp = k;
				k = p;
				p = temp;
			}
		}

		for (int i = 1; i <= N; i++) {
			if (isTrue[i] == true) {
				q.add(i);
			}
			while (!q.isEmpty()) {
				int cur = q.poll();
				for (int nxt : adj[cur]) {
					if (isTrue[nxt] == true)
						continue;
					isTrue[nxt] = true;
					q.add(nxt);
				}
			}
		}

		istrue = true;
		for (int i = 1; i <= M; i++) {
			for (int num : pt[i]) {
				if (isTrue[num] == true) {
					istrue = false;
				}
			}
			if (istrue == true)
				cnt++;
			istrue = true;
		}
		System.out.println(cnt);
	}
}