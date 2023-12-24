import java.util.*;
import java.io.*;

public class Main {
	static int[] num = new int[10];
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '9') {
				num[(s.charAt(i) - '0') - 3]++;
			} else {
				num[s.charAt(i) - '0']++;
			}
		}
		num[6] = (num[6]+1) / 2;
		for (int i = 0; i < 9; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
	}
}
