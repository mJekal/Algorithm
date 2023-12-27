class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for(int k : numbers){
            sum += k;
        }
        answer = (double) sum / numbers.length;
        return answer;
    }
}