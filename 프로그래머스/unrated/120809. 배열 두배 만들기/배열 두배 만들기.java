class Solution {
    public int[] solution(int[] numbers) {
        int index = 0;
        int[] answer = new int[numbers.length];
        for(int num : numbers){
            answer[index++] = 2*num;
        }
        return answer;
    }
}