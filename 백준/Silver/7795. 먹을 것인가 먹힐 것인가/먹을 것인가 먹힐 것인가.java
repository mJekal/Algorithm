import java.util.*;
import java.io.*;

public class Main {
	static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());

		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			Pair[] v = new Pair[n + m];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(st.nextToken());
				v[i] = new Pair(a, 0);
			}

			st = new StringTokenizer(br.readLine());
			for (int i = n; i < n + m; i++) {
				int b = Integer.parseInt(st.nextToken());
				v[i] = new Pair(b, 1);
			}

			Arrays.sort(v, (e1, e2) -> {
				return e1.x - e2.x;
			});
			
			int cnt = 0;
			int ans = 0;
			for (int i = 0; i < n + m; i++) {
				if (v[i].y == 0)
					ans += cnt;
				else
					cnt++;
			}
			System.out.println(ans);
		}
	}
}
