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

    static int[] dx = { 1, 0, -1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static int N, M, cnt;
    static int[][] board;
    static int[][] vis;
    static int min = Integer.MAX_VALUE;
    static List<Pair> cctv = new LinkedList<>();

    static void check(int x, int y, int dir) {
        while (true) {
            x += dx[dir];
            y += dy[dir];
            if (x < 0 || x >= N || y < 0 || y >= M || vis[x][y] == 6)
                break;
            if (vis[x][y] != 0 && vis[x][y] != 6)
                continue;
            vis[x][y] = 7;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        vis = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                vis[i][j] = board[i][j];
                if (board[i][j] != 0 && board[i][j] != 6) {
                    cctv.add(new Pair(i, j));
                }
            }
        }
        for (int i = 0; i < (1 << (2 * cctv.size())); i++) {
            int temp = i;
            for (int j = 0; j < cctv.size(); j++) {
                int dir = temp % 4;
                temp /= 4;
                Pair cur = cctv.get(j);
                int nx = cur.x;
                int ny = cur.y;
                switch (board[nx][ny]) {
                    case 1:
                        check(nx, ny, dir);
                        break;
                    case 2:
                        check(nx, ny, dir);
                        check(nx, ny, (dir + 2) % 4);
                        break;
                    case 3:
                        check(nx, ny, dir);
                        check(nx, ny, (dir + 1) % 4);
                        break;
                    case 4:
                        check(nx, ny, dir);
                        check(nx, ny, (dir + 1) % 4);
                        check(nx, ny, (dir + 2) % 4);
                        break;
                    case 5:
                        check(nx, ny, dir);
                        check(nx, ny, (dir + 1) % 4);
                        check(nx, ny, (dir + 2) % 4);
                        check(nx, ny, (dir + 3) % 4);
                        break;
                }
            }
            cnt = 0;
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (vis[n][m] == 0) cnt++;
                }
            }
            min = Math.min(min, cnt);
            vis = new int[N][M];
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    vis[n][m] = board[n][m];
                }
            }
        }
        System.out.println(min);
    }
}
