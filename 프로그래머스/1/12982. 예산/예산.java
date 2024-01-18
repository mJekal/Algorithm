import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);
        for(int num : d){
            answer+= num;
            if(answer > budget){
                System.out.println("di");
                break;
            }result++;
        }
        return result;
    }
}