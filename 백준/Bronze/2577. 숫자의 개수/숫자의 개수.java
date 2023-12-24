import java.util.*;
import java.io.*;

public class Main {
	static int[] num = new int[10];
	static int result = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 0; tc < 3; tc++) {
			result *= Integer.parseInt(br.readLine());
		}
		String res = Integer.toString(result);
		for(int i = 0; i<res.length(); i++)
		{		
			num[res.charAt(i)-'0']++;
		}
		for(int i = 0; i<10; i++)
		{		
			System.out.println(num[i]);
		}
		
	}
}
