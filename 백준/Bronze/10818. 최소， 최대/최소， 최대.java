import java.util.*;
import java.io.*;

public class Main {
	static int[] arr;
	static int n;
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for (int i = 0; i<n; i++) {
		 max = Math.max(arr[i], max);
		 min = Math.min(arr[i], min);
		}
		System.out.print(min + " " + max);
		
	}
}