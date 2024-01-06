import java.util.*;
import java.io.*;

class Main {

	static int func(int r, int c, int n) {
		int half = 1 << (n - 1);
		if (n == 0)
			return 0;
		if (r < half && c < half)
			return func(r, c, n - 1);
		if (r < half && c >= half)
			return half * half + func(r, c - half, n - 1);
		if (r >= half && c < half)
			return 2 * half * half + func(r - half, c, n - 1);
		if (r >= half && c >= half)
			return 3 * half * half + func(r - half, c - half, n - 1);
		return -1;
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		System.out.println(func(r, c, N));
	}
}