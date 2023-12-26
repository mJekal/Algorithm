import java.util.*;
import java.io.*;

public class Main {

	static Deque<Integer> dq = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push_front":
				int k = Integer.parseInt(st.nextToken());
				dq.addFirst(k);
				break;
			case "push_back":
				int kk = Integer.parseInt(st.nextToken());
				dq.addLast(kk);
				break;
			case "pop_front":
				if (!dq.isEmpty()) {
					System.out.println(dq.remove());
				} else {
					System.out.println("-1");
				}
				break;
			case "pop_back":
				if (!dq.isEmpty()) {
					System.out.println(dq.removeLast());
				} else {
					System.out.println("-1");
				}
				break;
			case "size":
				System.out.println(dq.size());
				break;
			case "empty":
				if (!dq.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println("1");
				}
				break;
			case "front":
				if (!dq.isEmpty()) {
					System.out.println(dq.getFirst());
				} else {
					System.out.println("-1");
				}
				break;
			case "back":
				if (!dq.isEmpty()) {
					System.out.println(dq.getLast());
				} else {
					System.out.println("-1");
				}
				break;
			}
		}

	}
}