import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer>[] adj = new ArrayList[10];
	static boolean[] vis = new boolean[10];

	public static void dfs(int cur) {
		vis[cur] = true;
		for (int nxt : adj[cur]) {
			if (vis[nxt] == true)
				continue;
			dfs(nxt);
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			adj[i] = new ArrayList<>();
		}
	}
}
