import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length>=11){
            for(int i : num_list){
                answer+=i;
            }
        answer--;}else{
              for(int i : num_list){
                answer*=i;   
            }
        }
        return answer;
    }
}