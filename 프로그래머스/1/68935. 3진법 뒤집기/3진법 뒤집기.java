import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> ans = new ArrayList<>();
        while(n > 0){
            ans.add(n % 3);
            n = n / 3;
        }
        int answer = 0;
        int power = 0;
        for(int i = ans.size() - 1; i >= 0; i--){
            answer += ans.get(i) * Math.pow(3, power);
            power++;
        }
        return answer;
    }
}
