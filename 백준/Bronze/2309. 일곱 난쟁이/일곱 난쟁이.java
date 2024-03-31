import java.io.*;
import java.util.*;

public class Main {

	static List<Integer> arr = new ArrayList<>();

	static void print(int k, int h) {
		for (int i = 0; i < 9; i++) {
			if (i == h || i == k)
				continue;
			System.out.println(arr.get(i));
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		for (int i = 0; i < 9; i++) {
			arr.add(Integer.parseInt(br.readLine()));
			sum += arr.get(i);
		}
		int k = sum - 100;
		Collections.sort(arr);
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (arr.get(i) + arr.get(j) == k) {
					print(i, j);
					return;
				}
				;
			}
		}

	}
}
