import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer>[] adj = new ArrayList[10];
	static boolean[] vis = new boolean[10];

	public static void dfs() {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		vis[1] = true;

		while (!s.isEmpty()) {
			int cur = s.pop();
			for (int nxt : adj[cur]) {
				if (vis[nxt])
					continue;
				s.push(nxt);
				vis[nxt] = true;
			}
		}
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			adj[i] = new ArrayList<>();
		}
	}
}
