import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int index =0;
        if(arr.length==1){
            return new int[] {-1};
        }
        int[] answer = new int[arr.length-1];
        int mn = Integer.MAX_VALUE;
        for(int num : arr){
            mn = Math.min(mn, num);
        }
        for(int i = 0; i<arr.length; i++){
            if(mn == arr[i]){
                continue;
            }
            answer[index++] = arr[i];
        }
        return answer;
    }
}