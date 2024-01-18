import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int index = 1;
        int cnt = 0;
        
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                cnt++;
            }
        }
        int[] answer = new int[cnt+1];
        answer[0] = arr[0];
                for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}