import java.util.*;
import java.io.*;

public class Main {

	static int[] arr = new int[1000005];
	static int cnt;
	static int N, S;

	static void back(int k, int tot) {
		if (k == N) {
			if (tot == S)
				cnt++;
			return;
		}
		back(k + 1, tot);
		back(k + 1, tot + arr[k]);
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		back(0, 0);
		if (S == 0)
			cnt--;
		System.out.println(cnt);
	}
}