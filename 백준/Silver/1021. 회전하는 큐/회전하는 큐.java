import java.util.*;
import java.io.*;

public class Main {

	static Deque<Integer> dq = new LinkedList<>();
	static int count;

	static int findIdx(int k, Deque<Integer> dq) {
		int idx = 0;
		for (int num : dq) {
			if (num == k) {
				return idx;
			}
			idx++;
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= N; i++) {
			dq.add(i);
		}
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int k = Integer.parseInt(st1.nextToken());
			int idx = findIdx(k, dq);
			while (dq.getFirst() != k) {
				if (idx < dq.size() - idx) {
					dq.addLast(dq.remove());
				} else {
					dq.addFirst(dq.removeLast());
				}
				count++;
			}
			dq.remove();
		}
		System.out.println(count);
	}
}