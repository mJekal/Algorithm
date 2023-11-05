import java.util.*;

class Solution {
    static int[] dx = {1, 0, -1};
    static int[] dy = {0, 1, -1};
    static int dir = 0;
    
    public int[] solution(int n) {
        int[][] board = new int[n][n];
        int v = 1;
        int check = n * (n + 1) / 2;
        int curx = 0;
        int cury = 0;
        
        while (v <= check) {
            board[curx][cury] = v++;
            int nx = curx + dx[dir];
            int ny = cury + dy[dir];
            
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] != 0) {
                dir = (dir + 1) % 3;
                nx = curx + dx[dir];
                ny = cury + dy[dir];
            }
            
            curx = nx;
            cury = ny;
        }
        
        int[] result = new int[check];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[index++] = board[i][j];
            }
        }
        return result;
    }
}
