import java.util.*;
import java.io.*;

public class Main {
	
		static class Pair {
		int x, y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;	
		}
	}
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int N,M;
	
	public static void main(String[] args) throws IOException {
	    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		N = Integer.parseInt(st.nextToken());
	    		M = Integer.parseInt(st.nextToken());
	    		int[][] board = new int[N][M];
	    		int[][] dist = new int[N][M];
	    		for (int i = 0; i<N;i++) {
	    			String s = br.readLine();
	    			for (int j = 0; j<M;j++) {
	    				board[i][j] = s.charAt(j) - '0';
	    			}
	    		}
	    		for (int i = 0; i<N;i++) {
	    			for (int j = 0; j<M;j++) {
	    				dist[i][j] = -1;
	    			}
	    		}
	    		
	    		Queue<Pair> Q = new LinkedList<>();
	    		
	    		Q.add(new Pair(0,0));
	    		dist[0][0] = 0;
	    		while(!Q.isEmpty()) {
	    			Pair cur = Q.poll();
	    			for(int dir = 0; dir < 4; dir++) {
	    				int nx = cur.x + dx[dir];
	    				int ny = cur.y + dy[dir];
	    				if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
	    				if(board[nx][ny] == 0 || dist[nx][ny]>=0) continue;
	    				
	    				dist[nx][ny] = dist[cur.x][cur.y]+1;
	    				Q.add(new Pair(nx,ny));
	    			
	    		}
	    		
	    }
	    		System.out.println(dist[N-1][M-1]+1);
	}
}
