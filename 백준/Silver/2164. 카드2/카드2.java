import java.util.*;
import java.io.*;

public class Main {

	static Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		while (q.size() != 1) {
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.poll());
	}
}