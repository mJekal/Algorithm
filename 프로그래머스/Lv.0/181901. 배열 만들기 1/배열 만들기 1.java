class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int len = n / k;
        int index = 0;
        answer = new int[len];
        for(int i = 1; i<=len; i++){
            answer[index++] = k*i;
        }
        return answer;
    }
}