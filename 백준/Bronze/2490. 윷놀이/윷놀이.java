import java.util.*;
import java.io.*;

public class Main {
	static int ZeroCnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 0; tc < 3; tc++) {
			ZeroCnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 4; i++) {
				int k = Integer.parseInt(st.nextToken());
				if (k == 0) {
					ZeroCnt++;
				}
			}
			switch (ZeroCnt) {
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			case 0:
				System.out.println("E");
				break;
			}
		}
	}
}
