class Solution {
    public boolean solution(int x) {
        int temp = x;
        boolean answer = true;
        int sum = 0;
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        if( temp % sum != 0){
            answer = false;
        }
        return answer;
    }
}