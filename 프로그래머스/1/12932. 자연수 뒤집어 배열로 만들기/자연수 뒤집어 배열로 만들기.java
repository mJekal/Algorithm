class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String sb = new StringBuilder(str).reverse().toString();
        int[] answer = new int[str.length()];
        int i = 0;
        for(char c : sb.toCharArray()){
           answer[i++] = c - '0';
        }
        
        return answer;
    }
}