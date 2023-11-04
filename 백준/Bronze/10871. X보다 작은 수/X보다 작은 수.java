import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	StringTokenizer st = new StringTokenizer(s);
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	String nums = br.readLine();
    	st = new StringTokenizer(nums);
    	for(int i = 0; i<N;i++) {
    		int num = Integer.parseInt(st.nextToken());
    		if(num < M) System.out.print(num+" ");
    	}

    }
}