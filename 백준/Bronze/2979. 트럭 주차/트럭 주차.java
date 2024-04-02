import java.io.*;
import java.util.*;

public class Main {
	static int[] cnt = new int[101];

	static int start = 0;
	static int fin = 0;
	static int answer = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int mx = -1;
		int mn = 101;
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			fin = Integer.parseInt(st.nextToken());
			mx = Math.max(mx, fin);
			mn = Math.min(mn, start);
			for (int t = start; t < fin; t++) {
				cnt[t]++;
			}
		}
		for (int t = mn; t <= mx; t++) {
			if (cnt[t] == 1) {
				answer += A*1;
			} else if (cnt[t] == 2) {answer += B*2;
			} else if (cnt[t] == 3) {answer += C*3;
			} else {
			}
		}
		System.out.println(answer);
	}
}