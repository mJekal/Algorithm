import java.io.*;
import java.util.*;

class Main {

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }    

    static int[] dx = {1,0, -1,0};
    static int[] dy = {0,1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc<T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int[][] board = new int[N][M];
            int[][] distF = new int[N][M];
            int[][] distS = new int[N][M];

            Queue<Pair> Qf = new LinkedList<>();
            Queue<Pair> Qs = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                String line = br.readLine();
                for (int j = 0; j < M; j++) {
                    char c = line.charAt(j);
                    if (c == '#') {
                        board[i][j] = -1;
                    } else {
                        if (c == '@') {
                            distS[i][j] = 1;
                            Qs.add(new Pair(i, j));
                            
                        } else if (c == '*') {
                            distF[i][j] = 1;
                            Qf.add(new Pair(i, j));
                            
                        }
                        board[i][j] = 0;
                    }
                }
            }

            while (!Qf.isEmpty()) {
                Pair cur = Qf.poll();
                for (int dir = 0; dir < 4; dir++) {
                    int nx = cur.x + dx[dir];
                    int ny = cur.y + dy[dir];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < M && board[nx][ny] != -1 && distF[nx][ny] == 0) {
                        distF[nx][ny] = distF[cur.x][cur.y] + 1;
                        Qf.add(new Pair(nx, ny));
                    }
                }
            }

            boolean escape = false;
            while (!Qs.isEmpty() && !escape) {

               Pair cur = Qs.poll();
                for (int dir = 0; dir < 4; dir++) {
                    int nx = cur.x + dx[dir];
                    int ny = cur.y + dy[dir];
                    if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                        System.out.println(distS[cur.x][cur.y]);
                        escape = true;
                        break;
                    }
                    if (board[nx][ny] != -1 && distS[nx][ny] == 0 && (distF[nx][ny] == 0 || distF[nx][ny] > distS[cur.x][cur.y] + 1)) {
                        distS[nx][ny] = distS[cur.x][cur.y] + 1;
                        Qs.add(new Pair(nx, ny));
                    }
                }
            }

            if (!escape) {
                System.out.println("IMPOSSIBLE");
            }
        }
    }


}
