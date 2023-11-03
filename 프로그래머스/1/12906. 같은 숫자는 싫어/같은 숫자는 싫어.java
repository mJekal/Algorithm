import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> Q = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        Q.add(arr[0]);
        answer.add(arr[0]);
        for(int i= 1; i<arr.length; i++){
            if(Q.peek()!=arr[i]) {answer.add(arr[i]);}
            Q.poll();
            Q.add(arr[i]);
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}