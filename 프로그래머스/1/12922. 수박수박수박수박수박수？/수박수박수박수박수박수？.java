class Solution {
    public String solution(int n) {
        String[] subac = new String[]{"수","박"};
        String answer = "";
        for(int i =0; i<n; i++){
            answer+= subac[i%2];
        }
        return answer;
    }
}