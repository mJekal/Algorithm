import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] ans = new int[1001];
        for(int num : array){
            ans[num]++;
        }
        int mx = 0;
          for(int num : ans){
           mx = Math.max(num,mx);
        }
        int cnt = 0;
        for(int num : ans){
            if(mx == num){
                cnt++;
            }
        }
        if(cnt != 1){
            answer =-1;
        }else{
            for(int i = 0; i<ans.length; i++){
                if(ans[i]==mx){
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}