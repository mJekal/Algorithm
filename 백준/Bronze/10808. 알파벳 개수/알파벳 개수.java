import java.util.*;
import java.io.*;

public class Main {
	static int[] alpabet = new int[26];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			alpabet[(s.charAt(i) - 97)]++;
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(alpabet[i]+" ");
		}
	}
}