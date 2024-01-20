import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[][] ans = new int[27][2];
        for(int i =0 ; i<27; i++){
        ans[i][0] = -1;}
        for(int i =  0; i<s.length(); i++){
            int k = (int) (s.charAt(i) - 'a');
            if(ans[k][1] == 0){
                answer[i] = -1;
            }
            ans[k][1]++;
            if(answer[i] != -1){
                answer[i] = i - ans[k][0];
            }
            ans[k][0] = i; 
        }
        return answer;
    }
}