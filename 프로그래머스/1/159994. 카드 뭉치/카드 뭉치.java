import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int k1 = cards1.length;
        int k2 = cards2.length;
        for(String s : goal){
            if(Arrays.asList(cards1).contains(s)){
                k1--;
                if(k1+Arrays.asList(cards1).indexOf(s)!=cards1.length-1){
                    answer = "No";
                }
            }else if(Arrays.asList(cards2).contains(s)){
                k2--;
                if(k2+Arrays.asList(cards2).indexOf(s)!=cards2.length-1){
                    answer = "No";
                }
        }}
        return answer;
    }
}