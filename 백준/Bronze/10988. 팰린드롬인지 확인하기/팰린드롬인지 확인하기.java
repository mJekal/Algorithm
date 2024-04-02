import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = str.length() / 2;
		int answer = 1;
		for(int i = 0; i<n; i++) {
			char c = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if(c != c2) {
				answer = 0;
			}
		}
		System.out.print(answer);
	}
}
