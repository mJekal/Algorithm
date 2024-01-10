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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		ArrayList<Pair> arr = new ArrayList<>();
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(st.nextToken());
			boolean check = false;
			for (Pair a : arr) {
				if (a.x == k) {
					a.y++;
					check = true;
					break;
				}
			}
			if (!check) {
				arr.add(new Pair(k, 1));
			}
		}
		Collections.sort(arr, (e1, e2) -> {
			return Integer.compare(e2.y, e1.y);
		});

		for (Pair a : arr) {
			for (int i = 0; i < a.y; i++) {
				System.out.print(a.x + " ");
			}
		}
	}
}
