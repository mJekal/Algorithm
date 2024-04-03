import java.io.*;
import java.util.*;

public class Main {
	static int[] A = new int[26];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		for (int i = 0; i < k; i++) {
			String str = br.readLine();
			char c = str.charAt(0);
			A[c - 'a']++;
		}
		String answer = "";
		for (int i = 0; i < 26; i++) {
			if (A[i] >= 5) {
				answer += (char) (i + 97);
			}
		}
		if (answer == "") {
			System.out.print("PREDAJA");
		}
		System.out.print(answer);
	}
}
