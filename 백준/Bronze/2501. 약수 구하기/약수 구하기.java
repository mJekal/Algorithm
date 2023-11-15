import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		int index = 1;
		int[] arr = new int[p + 1];

		for (int i = 1; i <= p; i++) {
			if (p % i == 0) {
				arr[index++] = i;
			}
		}
		System.out.println(arr[q]);

	}
}