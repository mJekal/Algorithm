import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer>[] adj = new ArrayList[10];
	static boolean[] vis = new boolean[10];
	static int v = 9;

	public static void bfs() {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= v; i++) {
			if (vis[i] == true)
				continue;
			q.add(i);
			vis[i] = true;

			while (!q.isEmpty()) {
				int cur = q.poll();
				for (int nxt : adj[cur]) {
					if (vis[nxt])
						continue;
					q.add(nxt);
					vis[nxt] = true;
				}
			}
		}
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			adj[i] = new ArrayList<>();
		}
	}
}
