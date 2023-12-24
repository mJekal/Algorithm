import java.util.*;
import java.io.*;

public class Main {
	static int[] num;
	static int[] num2;
	static int Isimpossible;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			num = new int[26];
			num2 = new int[26];
			Isimpossible = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			String ori = st.nextToken();
			String next = st.nextToken();

			for (char c : ori.toCharArray()) {
				num[c - 'a']++;
			}

			for (char c : next.toCharArray()) {
				num2[c - 'a']++;
			}

			for (int ii = 0; ii < 26; ii++) {
				if (num[ii] != num2[ii]) {
					System.out.println("Impossible");
					Isimpossible = 1;
					break;
				}
			}
			if (Isimpossible == 0) {
				System.out.println("Possible");
			}
		}
	}
}
