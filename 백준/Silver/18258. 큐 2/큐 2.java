import java.util.*;
import java.io.*;

public class Main {

	static Queue<Integer> q = new LinkedList<>();
	static int k;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				k = Integer.parseInt(st.nextToken());
				q.add(k);
				break;
			case "pop":
				if (q.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(q.poll());
					sb.append("\n");
				}
				break;
			case "size":
				sb.append(q.size());
				sb.append("\n");
				break;
			case "empty":
				if (q.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				break;
			case "front":
				if (q.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(q.peek());
					sb.append("\n");
				}
				break;
			case "back":
				if (q.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(k);
					sb.append("\n");
				}
				break;
			}
		}
		System.out.println(sb);
	}
}