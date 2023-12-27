class Solution {
    public int[] solution(int[] num_list) {
        int cnt = 0;
        int[] answer = new int[2];
        for(int k : num_list){
            if(k % 2 == 0){
                cnt++;
            }
        }
        answer[0] = cnt;
        answer[1] = num_list.length - cnt;
        return answer;
    }
}