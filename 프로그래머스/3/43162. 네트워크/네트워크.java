import java.util.*;

class Solution {
    static boolean[] vis;
	static int cnt = 0;
	static Queue<Integer> q = new LinkedList<>();
    
    public int solution(int n, int[][] computers) {
        vis = new boolean[n];
        for (int i = 0; i < n; i++) {
			vis[i] = true;
			q.offer(i);
			while (!q.isEmpty()) {
				int cur = q.poll();
				for (int next = 0; next < n; next++) {
					if (!vis[next] && computers[cur][next] == 1) {
						vis[next] = true;
						q.add(next);
						cnt++;
					}
				}
			}
		}
		return n - cnt;
	}

}