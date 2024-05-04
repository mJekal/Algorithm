import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] cnt = new int[26];
		for (char c : str.toCharArray()) {
			cnt[c - 'A']++;
		}
		StringBuilder firstHalf = new StringBuilder();
		StringBuilder secondHalf = new StringBuilder();

		int flag = 0;
		char mid = 0;

		for (int i = 0; i < 26; i++) {
			if (cnt[i] % 2 == 1) {
				mid = (char) (i + 'A');
				flag++;
				cnt[i]--;
			}
			if (flag == 2) {
				System.out.println("I'm Sorry Hansoo");
				return;
			}
			for (int j = 0; j < cnt[i]; j += 2) {
				firstHalf.append((char) (i + 'A'));
				secondHalf.append((char) (i + 'A'));
			}
		}
		secondHalf = secondHalf.reverse();
		if (mid != 0) {
			System.out.println(firstHalf.toString() + mid + secondHalf.toString());
		} else {
			System.out.println(firstHalf.toString() + secondHalf.toString());
		}
	}
}
