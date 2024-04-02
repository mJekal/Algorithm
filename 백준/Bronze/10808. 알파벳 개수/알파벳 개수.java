import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = s.length();
		int[] A = new int[26];
		for(int i = 0; i<n; i++) {
			int c = s.charAt(i) - 'a';
			A[c]++;
		}
		for(int i = 0; i<26; i++) {
			System.out.print(A[i] + " ");
		}
	}
}