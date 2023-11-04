class Solution {
    static int[] answer;

int nonzero(String s){
        int cnt_zero = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '0') {cnt_zero += 1;}
    }   
      return cnt_zero;
    }
        
    public int[] solution(String s) {
        int loop = 0;
        int zeros_cnt = 0;
        answer = new int[2];
        while(!s.equals("1")){
            int ans_bin = nonzero(s);
            int one = s.length() - ans_bin;
            s = Integer.toString(one,2);
            loop++;
            zeros_cnt += ans_bin;
        }
        answer[0] = loop;
        answer[1] = zeros_cnt;
        return answer;
    }
}