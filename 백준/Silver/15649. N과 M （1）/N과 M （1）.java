import java.util.*;
import java.io.*;

public class Main {
	    static int n, m;
	    static int[] arr;
	    static boolean[] isused;

	    static void backtracking(int k) {
	        if (k == m) {
	            for (int i = 0; i < m; i++)
	                System.out.print(arr[i] + " ");
	            System.out.println();
	            return;
	        }

	        for (int i = 1; i <= n; i++) {
	            if (!isused[i]) {
	                arr[k] = i;
	                isused[i] = true;
	                backtracking(k + 1);
	                isused[i] = false;
	            }
	        }
	    }

	    public static void main(String[] args) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	n = Integer.parseInt(st.nextToken());
	      	m= Integer.parseInt(st.nextToken());
	        arr = new int[m];
	        isused = new boolean[n + 1];
	        backtracking(0);
	    }
	}