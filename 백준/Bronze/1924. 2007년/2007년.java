import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] mon = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int n = 0;
        for (int i = 0; i < m; i++) {
            n += mon[i];
        }
        n += d-1;
        System.out.print(day[n%7]);
    }
}