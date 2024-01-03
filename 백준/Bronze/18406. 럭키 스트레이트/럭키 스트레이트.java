import java.util.*;
import java.io.*;

public class Main {
	static int[] arr;
	static int sum = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int len = s.length();
		arr = new int[len];
		for (int i = 0; i < len; i++) {
			int num = s.charAt(i) - '0';
			arr[i] = num;
		}
		for (int i = 0; i < len / 2; i++) {
			sum += arr[i];
		}
		for (int i = len - 1; i >= len / 2; i--) {
			sum -= arr[i];
		}
		if (sum == 0) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}
	}
}