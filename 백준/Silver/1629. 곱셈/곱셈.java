import java.util.*;
import java.io.*;

class Main {
	static long pow(long a, long b, long c) {
		if(b == 1) {
			return a % c;
		}
		long temp = pow(a,b/2,c);
		if(b % 2 == 1) {
			return temp*temp%c*a%c;
		}
		return temp * temp % c;
	}
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());

		System.out.println(pow(A,B,C));
	}
}