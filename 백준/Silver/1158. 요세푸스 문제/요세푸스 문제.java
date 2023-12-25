import java.util.*;
import java.io.*;

public class Main {
	static LinkedList<Integer> list = new LinkedList<>();
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		int result[] = new int[N];
		ListIterator<Integer> iter = list.listIterator();
		while (list.size() > 0) {
			for (int i = 0; i < K; i++) {
				if (!iter.hasNext()) {
					iter = list.listIterator();
				}
				if (i == K - 1) {
					result[count++] = iter.next();
				} 
				else {
					iter.next();
				}
			}
				iter.remove();
			}
		
		System.out.print("<");

		for(int i=0;i<N;i++) {
			if(i<N-1)
				System.out.print(result[i]+", ");
			else
				System.out.print(result[i]);
		}
		System.out.print(">");
	}
}