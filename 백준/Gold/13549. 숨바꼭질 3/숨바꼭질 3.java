import java.util.*;
import java.io.*;

public class Main {

	static int[] dist = new int[200001];
	static int K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		Arrays.fill(dist, -1);
		dist[N] = 0;
		q.add(N);
		while (!q.isEmpty() || dist[K] == -1) {
			int cur = q.poll();
			if (2 * cur < 200001 && dist[2 * cur] == -1) {
				dist[2 * cur] = dist[cur];
				q.add(2 * cur);
			}
			for (int nxt : new int[] { cur - 1, cur + 1 }) {
				if (nxt < 0 || nxt >= 200001)
					continue;
				if (dist[nxt] != -1)
					continue;
				dist[nxt] = 1 + dist[cur];
				q.add(nxt);
			}
		}
		System.out.println(dist[K]);
	}
}
