class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for(int i = brown; i>=3; i--){
            if(sum % i == 0){
                if (brown == (i*2)+((sum/i-2)*2)) {answer[0] = sum/i;
                answer[1] = i;}
            }
        }
        return answer;
    }
}