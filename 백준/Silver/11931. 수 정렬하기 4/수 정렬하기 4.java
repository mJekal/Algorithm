import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[] arr, temp;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for (int i = N-1; i>=0;i--) {
			sb.append(arr[i]+"\n");
		}
		System.out.println(sb.toString());
	}
}