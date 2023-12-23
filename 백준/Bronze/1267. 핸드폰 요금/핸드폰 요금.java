import java.util.*;
import java.io.*;

public class Main {
	static int Ymoney;
	static int Mmoney;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int k = Integer.parseInt(st.nextToken());
			Ymoney += 10 * ((k / 30) + 1);
			Mmoney += 15 * ((k / 60) + 1);
		}
		if (Ymoney > Mmoney) {
			System.out.println("M " + Mmoney);
		}
		if (Mmoney > Ymoney) {
			System.out.println("Y " + Ymoney);
		}
		if (Ymoney == Mmoney) {
			System.out.println("Y " +"M " + Ymoney);
		}
	}
}