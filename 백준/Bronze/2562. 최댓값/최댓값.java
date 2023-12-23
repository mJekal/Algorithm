import java.util.*;
import java.io.*;

public class Main {
	static int[] arr = new int[9];
	static int[] arr2 = new int[9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<9; i++) {
        	int k = Integer.parseInt(br.readLine());
        	arr[i] = k;
        	arr2[i] = k;
        }
        Arrays.sort(arr);
        System.out.println(arr[8]);
        for (int i = 0; i<9; i++) {
        	if(arr2[i] == arr[8])
        	System.out.println(i+1);
        }
    }
}
