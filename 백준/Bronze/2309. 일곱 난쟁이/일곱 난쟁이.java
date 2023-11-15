import java.util.*;
import java.io.*;

public class Main {
	static List<Integer> tail = new LinkedList<>();
	static int temp;
	static int sum = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 9; i++) {
			int n = Integer.parseInt(br.readLine());
			tail.add(n);
			sum += n;
			temp = sum;
		}
		Collections.sort(tail);
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				sum = sum - tail.get(i) - tail.get(j);
				if (sum == 100) {
					for (int ii = 0; ii < 9; ii++) {
						if (ii == i || ii == j)
							continue;
						System.out.println(tail.get(ii));
					}
                    i = 9;
					break;
				}
				sum = temp;
			}
		}
	}
}