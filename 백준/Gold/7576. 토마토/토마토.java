import java.util.*;
import java.io.*;

public class Main {
	static class Pair{
		int x,y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		Queue<Pair> Q = new LinkedList<>();
		int[][] board = new int[N][M];
		int[][] dist = new int[N][M];
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<M; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
                    if (board[i][j] == 1) {
                    Q.add(new Pair(i, j));}
                        if(board[i][j]==0) {
					dist[i][j] = -1;
				}
			}
		}
        
	
		while(!Q.isEmpty()) {
			Pair cur = Q.poll();
			for(int dir = 0; dir < 4; dir++) {
				int nx = cur.x + dx[dir];
				int ny = cur.y + dy[dir];
				if(nx < 0|| nx >=N||ny < 0|| ny >=M) continue;
				if(dist[nx][ny]>=0) continue;
				dist[nx][ny] = dist[cur.x][cur.y]+1;
				Q.add(new Pair(nx,ny));
			}
		}
		
		int ans = 0;
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
		if(dist[i][j] == -1) {
			System.out.println("-1");
            return;
		}
		ans = Math.max(ans, dist[i][j]);
			}
		
	}
		System.out.println(ans);
}
}