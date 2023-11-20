import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int num: numbers){
            set.add(num);
        }
        int sum = 0;
        for(int i = 1; i<=9; i++){
            if(set.contains(i)){
                continue;
            }
            sum += i;
        }
        return sum;
    }
}