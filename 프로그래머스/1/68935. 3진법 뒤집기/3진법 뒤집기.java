import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        String str = "";
        while(n>0){
            answer = n % 3;
            str += Integer.toString(answer);
            n /= 3;
        }
        for(int i =0  ; i<str.length(); i++){
            int k = (str.charAt(str.length()-1-i) - '0') * (int)Math.pow(3,i);
            sum+=k;
        }
        return sum;
    }
}