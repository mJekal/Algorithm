import java.util.*;
import java.io.*;

public class Main {
	static int cnt;
	static int[] char1 = new int[26];
	static int[] char2 = new int[26];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		for(char c : s1.toCharArray()) {
			char1[c-'a']++;
		}
		for(char c : s2.toCharArray()) {
			char2[c-'a']++;
		}
		for(int i = 0; i<26; i++) {
			if(char1[i] != char2[i]) {
				cnt += (Math.max(char1[i], char2[i]) - Math.min(char1[i], char2[i]));
			}
		}
		System.out.println(cnt);
	}
}
