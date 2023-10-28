
import java.util.*;
import java.io.*;

public class Main {
	    static class Pair {
	        int x, y;
	        Pair(int x, int y) {
	            this.x = x;
	            this.y = y;
	        }
	    }
        static int cnt = 0;
        static int area = 0;
        static int max = 0;
	    // 상우하좌(시계)
	    static int[] dx = {1, 0, -1, 0};
	    static int[] dy = {0, 1, 0, -1};

	    public static void main(String[] args) throws IOException {
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	    	
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int n = Integer.parseInt(st.nextToken());
	    	int m = Integer.parseInt(st.nextToken());
	    	
	    	int[][] board = new int[n][m];
		    boolean[][] vis = new boolean[n][m];
	    	
	    	for (int i = 0; i < n ; i++) {
	    		st = new StringTokenizer(br.readLine());
	    		for (int j = 0; j < m; j++) {
	    			board[i][j] = Integer.parseInt(st.nextToken());
	    		}
	    	}
	    	
	        Queue<Pair> Q = new LinkedList<>();

	        for(int i=0; i<n; i++){
	            for(int j=0; j<m; j++){
	            	if(vis[i][j] || board[i][j]==0) {
	            		continue;
	            	}
	    	        vis[i][j] = true;
	    	        Q.add(new Pair(i, j));

	        while (!Q.isEmpty()) {
	            Pair cur = Q.poll();
	            area++;
	            for (int dir = 0; dir < 4; dir++) {
	                int nx = cur.x + dx[dir];
	                int ny = cur.y + dy[dir];
	                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
	                if (vis[nx][ny] || board[nx][ny] != 1) continue;
	                vis[nx][ny] = true;
	                Q.add(new Pair(nx, ny));
	            }
	        }
	        cnt++;
	        if(area > max){
                max = area;
	    }
        	area = 0;
            }
           }
	        System.out.println(cnt);
	        System.out.println(max);
}
}


