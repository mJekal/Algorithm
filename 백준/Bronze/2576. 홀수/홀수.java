import java.util.*;
import java.io.*;

public class Main {
	static int sum;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean AllOdd = true;
		for (int i = 0; i < 7; i++) {
			int k = Integer.parseInt(br.readLine());
			if (k % 2 != 0) {
				sum += k;
				if (min > k) {
					min = k;
				}
				AllOdd = false;
			}
		}
		if (!AllOdd) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println("-1");
		}
	}
}