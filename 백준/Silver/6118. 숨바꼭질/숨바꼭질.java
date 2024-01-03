import java.util.*;
import java.io.*;

public class Main {

	static ArrayList<Integer> [] adj;
	static int[] dist;
	static int cnt;
	static int k;
	static int mx = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		adj = new ArrayList[N+1];
		
		for(int i = 1; i<= N; i++) {
			adj[i] = new ArrayList<>();
		}
		
		dist = new int[N+1];
		Arrays.fill(dist, -1);
		
		for(int i = 0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			adj[v1].add(v2);
			adj[v2].add(v1);
			
		}
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		dist[1] = 0;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int nxt : adj[cur]) {
				if(dist[nxt] != -1) continue;
				q.add(nxt);
				dist[nxt] = dist[cur] + 1;
			}
		}
		
		for(int i = 1; i<=N; i++) {
		 mx = Math.max(mx, dist[i]);
		}
		
		for(int i = N; i>0; i--) {
			if(dist[i] == mx) {
				cnt++;
				k = i;
			}
		}
		System.out.print(k + " "+ mx + " " + cnt);
	}
}