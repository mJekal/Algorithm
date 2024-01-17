class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int index =0;
        int cnt  = 0;
        for(int num : numlist){
            if(num % n == 0){
                cnt++; 
            }
        }
        answer = new int[cnt];
                for(int num : numlist){
            if(num % n == 0){
                answer[index++] = num;
            }
        }
        return answer;
    }
}