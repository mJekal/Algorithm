import java.util.*;
import java.io.*;

public class Main {
	public static class Pair {
		int x, y;
		
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		Queue<Pair> JQ = new LinkedList<>();
		Queue<Pair> FQ = new LinkedList<>();
	
		char[][] board = new char[N][M];
		int[][] Jdist = new int[N][M];
		int[][] Fdist = new int[N][M];
	
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				board[i][j] = s.charAt(j);

				Jdist[i][j] = -1;
				Fdist[i][j] = -1;
				if (board[i][j] == 'J') {
					JQ.add(new Pair(i, j));
					Jdist[i][j] = 0;
				}
				if (board[i][j] == 'F') {
					FQ.add(new Pair(i, j));
					Fdist[i][j] = 0;
				}
			}
		}

		while (!FQ.isEmpty()) {
			Pair Fcur = FQ.poll();
			for (int dir = 0; dir < 4; dir++) {
				int Fnx = Fcur.x + dx[dir];
				int Fny = Fcur.y + dy[dir];
				if (Fnx < 0 || Fnx >= N || Fny < 0 || Fny >= M) continue;
				if (board[Fnx][Fny] == '#' || Fdist[Fnx][Fny] >= 0) continue;
				Fdist[Fnx][Fny] = Fdist[Fcur.x][Fcur.y] + 1;
				FQ.add(new Pair(Fnx, Fny));
			}
		}
	
		while (!JQ.isEmpty()) {
			Pair Jcur = JQ.poll();
			for (int dir = 0; dir < 4; dir++) {
				int Jnx = Jcur.x + dx[dir];
				int Jny = Jcur.y + dy[dir];
				if (Jnx < 0 || Jnx >= N || Jny < 0 || Jny >= M) {
					System.out.println(Jdist[Jcur.x][Jcur.y] + 1);
					return;
				}
				if (board[Jnx][Jny] == '#' || Jdist[Jnx][Jny] >= 0) continue;
				if (Fdist[Jnx][Jny] != -1 && Fdist[Jnx][Jny] <= Jdist[Jcur.x][Jcur.y] + 1) continue;
				Jdist[Jnx][Jny] = Jdist[Jcur.x][Jcur.y] + 1;
				JQ.add(new Pair(Jnx, Jny));
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}

