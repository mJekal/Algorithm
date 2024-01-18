class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i<=count; i++){
            answer += (long)price*i;
        }
        if(money>=answer){
            return 0;
        }
        answer -= (long)money;
        
        return answer;
    }
}