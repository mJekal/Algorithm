import java.util.*; 

class Solution {
    
    static int[] num1 = {1,2,3,4,5};
    static int[] num2 = {2,1,2,3,2,4,2,5};
    static int[] num3 = {3,3,1,1,2,2,4,4,5,5};
    
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int index =0;int cnt = 0;
        int sc1 = 0;
        int sc2 = 0;
        int sc3 = 0;
        for(int i = 0; i<answers.length; i++){
           if(num1[i%num1.length] == answers[i]){
                sc1++;
            }
            if(num2[i%num2.length] == answers[i]){
                sc2++;
            }
            if(num3[i%num3.length] == answers[i]){
                sc3++;
            }}
        answer[0] = sc1;
        answer[1] = sc2;
        answer[2] = sc3;
        int mx = -1;
        for(int i =0 ; i<3; i++){
            mx = Math.max(mx,answer[i]);
        }
        for(int i =0 ; i<3; i++){
            if(answer[i]==mx){
                cnt++;
            }
        }
        int[] ans = new int[cnt];
        for(int i =0 ; i<3; i++){
            if(answer[i]==mx){
               ans[index++] = i+1;
            }
        }
            return ans;
    }
}