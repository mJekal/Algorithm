import java.util.*;
class Solution {
    static int[] ans;
    public int[] solution(int[] array, int[][] commands) {
        int[] ans = new int[commands.length];
        for (int t = 0; t< commands.length; t++){
            int i = commands[t][0]-1;
            int j = commands[t][1];
            int k = commands[t][2];
            
            int[] answer = Arrays.copyOfRange(array, i, j);
            Arrays.sort(answer);
            ans[t] = answer[k-1];
            }
        
         
        return ans;
    }
}