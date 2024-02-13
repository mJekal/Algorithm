class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] win = {6,6,5,4,3,2,1};
        int cnt = 0;
        int zero = 0;
        for(int num:lottos){
            if(num==0){
                zero++;
            }
            for(int i = 0; i<6; i++){
                if(num==win_nums[i]){
                    cnt++;
                }
            }
        }
        answer[1] = win[cnt];
        answer[0] = win[cnt+zero];
        return answer;
    }
}