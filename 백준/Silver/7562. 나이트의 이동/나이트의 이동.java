import java.util.*;
import java.io.*;

public class Main {

	static class Pair {
		int x, y;
		Pair(int x,int y){
			this.x = x;
			this.y = y;
		}
		
	}
	
	static int[] dx = {2,1,-1,-2,-2,-1, 1, 2};
	static int[] dy = {1,2, 2, 1,-1,-2,-2,-1};
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=0; tc<T;tc++) {
			int I = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			Queue<Pair> Q = new LinkedList<>();
			
			int[][] dist = new int[I][I] ;
			
			for(int i = 0; i<I; i++) {
				for(int j = 0; j<I; j++) {
				dist[i][j] = -1;
			}
			}
			
			int kk = Integer.parseInt(st.nextToken());
			int tt = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());

			dist[kk][tt] = 0;
			Q.add(new Pair(kk,tt));
			
			while(!Q.isEmpty()) {
			Pair cur = Q.poll();
			for(int dir=0; dir<8; dir++) {			
				int ny = cur.y + dy[dir];
				int nx = cur.x + dx[dir];
			
			if(nx<0||nx>=I||ny<0||ny>=I) continue;
			if(dist[nx][ny]!=-1) continue;
				dist[nx][ny] = dist[cur.x][cur.y]+1;
				Q.add(new Pair(nx,ny));
				
			}
			}
			
			
			
	System.out.println(dist[k][t]);	
	}
	
	}
	
	
	
	
}