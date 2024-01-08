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
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(st.nextToken());
	     int M= Integer.parseInt(st.nextToken());
        
        Pair result = solve(N, M, 1, 1, 0);

        System.out.println(result.y + " " + result.x);
    }

    static Pair solve(int n, int m, int r, int c, int d) {
        if (n == 1) return new Pair(r, c);

        n /= 2;
        int area = n * n;

        if (d == 0) {
            if (1 <= m && m <= area) return solve(n, m, r, c, 1);
            if (area < m && m <= 2 * area) return solve(n, m - area, r + n, c, 0);
            if (2 * area < m && m <= 3 * area) return solve(n, m - 2 * area, r + n, c + n, 0);
            return solve(n, m - 3 * area, r + n - 1, c + 2 * n - 1, 3);
        }

        if (d == 1) {
            if (1 <= m && m <= area) return solve(n, m, r, c, 0);
            if (area < m && m <= 2 * area) return solve(n, m - area, r, c + n, 1);
            if (2 * area < m && m <= 3 * area) return solve(n, m - 2 * area, r + n, c + n, 1);
            return solve(n, m - 3 * area, r + 2 * n - 1, c + n - 1, 2);
        }

        if (d == 2) {
            if (1 <= m && m <= area) return solve(n, m, r, c, 3);
            if (area < m && m <= 2 * area) return solve(n, m - area, r - n, c, 2);
            if (2 * area < m && m <= 3 * area) return solve(n, m - 2 * area, r - n, c - n, 2);
            return solve(n, m - 3 * area, r - n + 1, c - 2 * n + 1, 1);
        }

        if (1 <= m && m <= area) return solve(n, m, r, c, 2);
        if (area < m && m <= 2 * area) return solve(n, m - area, r, c - n, 3);
        if (2 * area < m && m <= 3 * area) return solve(n, m - 2 * area, r - n, c - n, 3);
        return solve(n, m - 3 * area, r - 2 * n + 1, c - n + 1, 0);
    }
}
