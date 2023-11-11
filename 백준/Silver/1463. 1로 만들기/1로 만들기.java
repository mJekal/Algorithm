import java.io.*;
import java.util.*;

public class Main {
	static int[] table = new int[1000004];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		table[1] = 0;
		for (int x = 2; x <= N; x++) {
			table[x] = table[x - 1] + 1;
			if (x % 3 == 0) {
				table[x] = Math.min(table[x / 3] + 1, table[x]);
			}
			if (x % 2 == 0) {
				table[x] = Math.min(table[x], table[x / 2] + 1);
			}
		}
		System.out.println(table[N]);
	}
}
