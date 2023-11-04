import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int temp = s.length();
		String ss = br.readLine();
		s = s.replaceAll(ss,"");
		int answer = (temp-s.length())/ss.length();
		System.out.print(answer);

	}
}