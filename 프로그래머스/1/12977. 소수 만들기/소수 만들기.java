import java.util.*;

class Solution {
    static int count = 0; static int index = 0;
    static void isPrime(int n){
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
                count++;
                break;
            }
        }
    }
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int answer = -1;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    index++;
                    isPrime(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        return index - count;
    }
}