class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int ans = 0;
        int index = 0;
        for(int num : num_list){
            if(index % 2 == 0){
                answer += num_list[index++];
            }else{
                ans += num_list[index++];
            }
        }
        return answer >= ans ? answer : ans;
    }
}