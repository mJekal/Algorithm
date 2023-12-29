import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		int[][] edge = new int[10][2];
		int[] deg = new int[10];
		int[][] adj = new int[10][];
		int[] idx = new int[10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());

		for (int i = 0; i < e; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			edge[i][0] = Integer.parseInt(st.nextToken());
			edge[i][1] = Integer.parseInt(st.nextToken());
			deg[edge[i][0]]++;
		}

		for (int i = 1; i <= v; i++) {
			adj[i] = new int[deg[i]];
		}

		for (int i = 0; i < e; i++) {
			int u = edge[i][0];
			int vertexV = edge[i][1];
			adj[u][idx[u]] = vertexV;
			idx[u]++;
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
