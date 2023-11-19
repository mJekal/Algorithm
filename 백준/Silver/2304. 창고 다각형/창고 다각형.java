import java.util.Scanner;

public class Main {
    static final int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
    static final int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[1002];
        int[] le = new int[1002];
        int[] re = new int[1002];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a] = b;
        }

        le[0] = 0;
        re[1001] = 0;
        for (int i = 1; i <= 1000; i++)
            le[i] = Math.max(le[i - 1], arr[i]);
        for (int i = 1000; i > 0; i--)
            re[i] = Math.max(re[i + 1], arr[i]);

        int ans = 0;
        for (int i = 1; i <= 1000; i++) {
            ans += Math.min(re[i], le[i]);
        }
        System.out.println(ans);
    }
}
