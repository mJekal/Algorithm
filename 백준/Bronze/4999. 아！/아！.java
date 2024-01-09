import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String s2 = br.readLine();
		if(s.length()<s2.length()) {
			System.out.println("no");
		}else {
			System.out.println("go");
		}
	}
}