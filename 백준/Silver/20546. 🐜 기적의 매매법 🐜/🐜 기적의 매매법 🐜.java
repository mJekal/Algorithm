import java.util.*;
import java.io.*;

public class Main {
	static int[] arr = new int[14];
	static int day;
	static int JMONEY;
	static int SMONEY;
	static int SCNT, JCNT;

	static boolean IsBuy(int day) {
		for (int i = day - 3; i < day; i++) {
			if (arr[i] <= arr[i + 1])
				return false;
		}
		return true;
	}

	static boolean IsSell(int day) {
		for (int i = day - 3; i < day; i++) {
			if (arr[i] >= arr[i + 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp = Integer.parseInt(br.readLine());
		SMONEY = temp;
		JMONEY = temp;
		// System.out.println(SMONEY + " " + JMONEY);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 14; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 4; i < 14; i++) {
			if (IsBuy(i) && SMONEY >= arr[i]) {
				SCNT += SMONEY / arr[i];
				SMONEY = (SMONEY % arr[i]);
			}
			if (IsSell(i)) {
				SMONEY += SCNT * arr[i];
				SCNT = 0;
			}
			for (int j = 0; j < 14; j++) {
				if (arr[i] <= JMONEY && JMONEY >= arr[j]) {
					JCNT += JMONEY / arr[j];
					JMONEY = (JMONEY % arr[j]);
				}
			}
		}
		int sResult = arr[13] * SCNT + SMONEY;
		int JResult = arr[13] * JCNT + JMONEY;
		if (sResult > JResult) {
			System.out.println("TIMING");
		}
		if (sResult < JResult) {
			System.out.println("BNP");
		}
		if (sResult == JResult) {
			System.out.println("SAMESAME");
		}
	}
}