import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = -1;
        for(long i = 1; i<=Math.sqrt(n); i++){
            if(i*i == n){
                return (i+1)*(i+1);
            }
        }
        return answer;
    }
}