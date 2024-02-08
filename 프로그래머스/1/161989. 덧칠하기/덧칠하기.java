class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        for(int num : section){
            if(start+m>num){
               continue;
            }
            start = num;
            answer++;
        }
        return answer+1;
    }
}