import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        int[] alpha = new int[26];

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for(int i =0; i<str.length(); i++){
        alpha[str.charAt(i)-97]++;
        }
        
        for(int i =0; i<26; i++){
        System.out.print(alpha[i]+" ");
        }
        
        
        }
}