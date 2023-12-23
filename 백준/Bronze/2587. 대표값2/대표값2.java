import java.util.*;
import java.io.*;

public class Main {
	static int sum;
	static int[] arr = new int[5];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			int k = Integer.parseInt(br.readLine());
			sum += k;
			arr[i] = k;
		}
		Arrays.sort(arr);
		System.out.println(sum / 5);
		System.out.println(arr[2]);
	}
}