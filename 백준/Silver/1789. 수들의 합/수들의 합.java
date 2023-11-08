import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());
		long num = 0;
		for (long k = 1; k <= S; k++) {
			num += k;
			if (S == 1) {
				System.out.println(1);
				break;
			}
			if (num > S) {

				System.out.println(k - 1);
				return;
			}
		}

	}
}