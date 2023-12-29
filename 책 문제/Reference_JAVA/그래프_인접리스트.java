import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());

		ArrayList<Integer>[] adj = new ArrayList[v + 1];

		for (int i = 1; i <= v; i++) {
			adj[i] = new ArrayList<>();
		}

		// 방향 그래프
		for (int i = 0; i < e; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			adj[v1].add(v2);
			// 무방향 그래프
			// adj[v2].add(v1);
		}
	}
}

/*
 * 입력
 * 
 * 5
 * 7
 * 3 1
 * 2 3
 * 4 1
 * 5 2 
 * 5 4 
 * 3 5 
 * 2 4
 * 
 */
