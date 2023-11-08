import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++){
            int f = commands[i][0] -1;
            int t = commands[i][1];
            int k = commands[i][2]-1;
            int[] sub = Arrays.copyOfRange(array,f,t);
            Arrays.sort(sub);
            answer[i] = sub[k];
}

        return answer;
    }
}