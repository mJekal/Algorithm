import java.io.*;
import java.util.*;

class Main{

    static int gcd(int a, int b){

        while(b!=0){

        int temp = b;
        b = a%b;
        a = temp;
        }
       return a; 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = M - gcd(N,M);
        System.out.println(result);

    }
    
}