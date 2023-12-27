class Solution {
    public int[] solution(int[] num_list) {
       int len = num_list.length - 1; 
        int[] answer = new int[len + 1];
        for(int i = len; i>=0; i--) {
        	answer[len - i] = num_list[i];
        }
        return answer;
    }
}
