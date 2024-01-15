class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        for(int k: num_list){
            mul *= k;
            answer += k;
        }
        return mul > answer*answer ? 0 : 1;
    }
}