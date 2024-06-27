import java.util.*;
import java.io.*;

public class Main {

	static int[][] board = new int[100][100];
	static int k = 4;
	static int mxx = -1;
	static int mnx = 103;
	static int mxy = -1;
	static int mny = 103;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (k-- > 0) {
			st = new StringTokenizer(br.readLine());
			int dx = Integer.parseInt(st.nextToken());
			int dy = Integer.parseInt(st.nextToken());
			int nx = Integer.parseInt(st.nextToken());
			int ny = Integer.parseInt(st.nextToken());
			for (int i = dx; i < nx; i++) {
				for (int j = dy; j < ny; j++) {
					board[j][i] = 1;
					mxx = Math.max(i, mxx);
					mnx = Math.min(mnx, j);
					mny = Math.min(i, mny);
					mxy = Math.max(mxy, j);
				}
			}
		}
		mxx = Math.max(mxx, mnx);
		mxy = Math.min(mxy, mny);
		
		for(int i = 0; i<100; i++) {
			for(int j = 0; j<100; j++) {
				if(board[i][j] == 1) {cnt++;}
			}
		}
			System.out.println(cnt);
		


	}
}