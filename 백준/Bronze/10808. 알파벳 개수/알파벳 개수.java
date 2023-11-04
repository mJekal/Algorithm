import java.util.*;
import java.io.*;

public class Main {
	static int[] ans;
    public static void main(String[] args) throws IOException {
    	ans = new int[26];
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	for(char c : s.toCharArray()) {
    		int index = c-'a';
    		ans[index] += 1;
    	}
    	for(int i = 0; i<26; i++) {
    		System.out.print(ans[i]+" ");
    	}
    }
}