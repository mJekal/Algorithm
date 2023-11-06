public class Solution {
    static final int dx[] = {0, -1, 1, 0};
    static final int dy[] = {-1, 0, 0, 1};

    static boolean isNextPeople(char[][] board, int x, int y, int except) {
        for (int dir = 0; dir < 4; dir++) {
            if (dir == except) continue;

            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5)
                continue;
            if (board[nx][ny] == 'P') return true;
        }
        return false;
    }

    static boolean ischeck(char[][] board, int x, int y) {
        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5)
                continue;
            switch (board[nx][ny]) {
                case 'P': return false;
                case 'O':
                    if (isNextPeople(board, nx, ny, 3 - dir)) return false;
                    break;
            }
        }
        return true;
    }

    static boolean ischeck(char[][] board) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (board[x][y] != 'P') continue;
                if (!ischeck(board, x, y)) return false;
            }
        }
        return true;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for (int i = 0; i < 5; i++) {
            String[] place = places[i];
            char[][] board = new char[5][5];
            for (int j = 0; j < 5; j++) {
                board[j] = place[j].toCharArray();
            }
            if (ischeck(board)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
}