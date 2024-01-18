class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] ans = new int[10];
        for(int num: numbers){
            ans[num]++;
        }
        for(int i =0; i<=9; i++){
            if(ans[i]==0){
                answer+=i;
            }
        }
        return answer;
    }
}