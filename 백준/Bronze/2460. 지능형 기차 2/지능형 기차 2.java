import java.util.*;
import java.io.*;

public class Main {
	static int out;
	static int in;
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int minus = Integer.parseInt(st.nextToken());
			int plus = Integer.parseInt(st.nextToken());
			out -= minus;
			in += plus;
			int sum = out + in;
			max = Math.max(sum, max);
		}
		System.out.print(max);
	}
}