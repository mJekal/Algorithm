import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer>[] adj = new ArrayList[10];
	static boolean[] vis = new boolean[10];

	public static void dfs() {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		while (!s.empty()) {
			int cur = s.pop();
			if (vis[cur] == true)
				continue;
			vis[cur] = true;
			for (int nxt : adj[cur]) {
				if (vis[nxt])
					continue;
				s.push(nxt);
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			adj[i] = new ArrayList<>();
		}
	}
}
