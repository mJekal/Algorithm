import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int tc = Integer.parseInt(br.readLine());
    	String s = br.readLine();
    	StringTokenizer st = new StringTokenizer(s,"*");
    	String start = st.nextToken();
    	String end = st.nextToken();
    	
    	for(int T = 0; T<tc ; T++ ) {
    	String ss = br.readLine();
    	if(ss.length()<start.length()+end.length()) {
    		System.out.println("NE");
    		continue;
    	}
        if(ss.startsWith(start)&&ss.endsWith(end)) System.out.println("DA");
        else System.out.println("NE");
    	}
    }
}