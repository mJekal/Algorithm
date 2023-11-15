import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine());
			String str = Integer.toString(n, 2);
			StringBuilder sb = new StringBuilder(str);

			sb.reverse();
			char[] c = sb.toString().toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '1') {
					System.out.print(i + " ");
				}
				
			}System.out.println();
		}

	}
}
