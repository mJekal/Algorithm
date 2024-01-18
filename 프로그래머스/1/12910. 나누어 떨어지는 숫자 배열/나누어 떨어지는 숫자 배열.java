import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;  int index =0;
        int[] answer;
        for(int num : arr ){
            if(num % divisor == 0){
                cnt++;
            }
        }
        if(cnt == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
       answer = new int[cnt];
       for(int num : arr ){
            if(num % divisor == 0){
                answer[index++] = num;
            }
        }
        
        }Arrays.sort(answer);
        return answer;
    }
}