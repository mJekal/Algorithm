import java.io.*;
import java.util.*;

class Main {
	static int max = Integer.MIN_VALUE;
	static int[] result = new int[10];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (char c : br.readLine().toCharArray()) {
			result[c - '0']++;
		}
		result[6] += result[9];
		if(result[6] % 2 == 0) {
			result[6] /= 2;
		} else {
			result[6] = result[6] / 2 + 1;
		}
		for (int i = 0; i < 9; i++) {
			max = Math.max(result[i], max);
		}
		System.out.print(max);
	}
}