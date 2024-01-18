class Solution {
    static boolean isEven(int k){
        int cnt = 0;
        for(int i = 1; i<=k; i++){
            if(k % i == 0){
                cnt++;
            }
        }
        if(cnt % 2 != 0){
            return false;
        }
        return true;
    }
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; i++){
            if(isEven(i)){
                answer += i;
            }else{
                answer -= i;
            }
        }
        return answer;
    }
}