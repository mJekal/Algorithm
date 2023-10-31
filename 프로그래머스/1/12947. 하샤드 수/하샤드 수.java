class Solution {
    public boolean solution(int x) {
        int temp = x;
        boolean answer = false;
        int sum = 0;
        while(true){
            sum += x % 10;
            if(x<10) break;
            x /= 10;
        }

        if(temp%sum == 0) answer = true;
        return answer;
    }
}