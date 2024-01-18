import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int index = 0;
        String str = Long.toString(n);
        long[] ans = new long[str.length()];
        for(char c : str.toCharArray()){
            ans[index++] = c - '0';
        }
        Arrays.sort(ans);
        for(int i = str.length() - 1; i>=0; i--){
            answer+=(long)ans[i]*Math.pow(10,i);    
        }
        return answer;
    }
}