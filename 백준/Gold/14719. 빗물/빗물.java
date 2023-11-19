import java.io.*;
import java.util.*;

public class Main {
	static int[] arr = new int[502];
	static int[] left = new int[502];
	static int[] right = new int[502];
	static int[] result = new int[502];
	static int res;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < W + 1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < 501; i++) {
			left[i + 1] = Math.max(left[i], arr[i + 1]);
		}
		for (int i = 501; i > 0; i--) {
			right[i - 1] = Math.max(right[i], arr[i - 1]);
		}
		for (int i = 0; i < 501; i++) {
			result[i] = Math.min(right[i], left[i]);
		}
		for (int i = 0; i < W+3; i++) {
			res += result[i];
			res -= arr[i];
		}
		System.out.println(res);
	}
}