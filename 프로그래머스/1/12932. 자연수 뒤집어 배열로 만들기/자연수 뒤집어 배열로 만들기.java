class Solution {
    public int[] solution(long n) {
        int index = 0;
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        for(char c : str.toCharArray()){
            answer[str.length()-index-1] = c - '0';
            index++;
        }
        return answer;
    }
}