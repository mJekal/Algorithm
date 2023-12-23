import java.util.*;
import java.io.*;

public class Main {
	static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
	static int[] arr2 = new int[20];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			for (int j = start - 1; j < end; j++) {
				arr2[j] = arr[j];
			}
			start = start - 1;
			end = end - 1;
			int len = end - start + 1;
			for (int j = 0; j < len; j++) {
				arr[start++] = arr2[end--];
			}
		}
		for (int i = 0; i < 20; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}