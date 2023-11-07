import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
       
        List<Integer> arr2 = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        for(int num: arr){
            if(num < min) {min = num;};
            arr2.add(num);
        }
        arr2.remove(Integer.valueOf(min));
        if(arr.length == 1) return new int[] {-1};
        int[] result = new int[arr2.size()];
        for(int i = 0; i<result.length; i++){
            result[i] = arr2.get(i);
        }
    
   
    return result;
     }     
}