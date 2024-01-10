import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int temp = N;
		long[] answer = new long[N];
		int index = 0;
		while (N > 0) {
			while (st.hasMoreTokens()) {
				String s = st.nextToken();
				String ans = "";
				for (int i = s.length() - 1; i >= 0; i--) {
					ans += s.charAt(i);
				}
				answer[--N] = Long.parseLong(ans);
			}
			if (N > 0) {
				st = new StringTokenizer(br.readLine());
			}
		}
		Arrays.sort(answer);
		for (int i = 0; i < temp; i++) {
			System.out.println(answer[i]);
		}
	}
}