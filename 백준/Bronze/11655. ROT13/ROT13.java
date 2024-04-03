import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('A' <= c && c <= 'Z') {
				int k = ((int) c - 'A' + 13) % 26 + 'A';
				System.out.print((char) k);
			} else if ('a' <= c && c <= 'z') {
				int k = ((int) c - 'a' + 13) % 26 + 'a';
				System.out.print((char) k);
			} else {
				System.out.print(c);
			}
		}
	}
}
