class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = (long)x;
        long temp1 = (long)x;
        int index = 0;
        for(int i = 1; i<=n ; i++){
            answer[i-1] = temp1;
            temp1 = temp*(long)(i+1) ;
        }
        return answer;
    }
}