class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for(char c : s.toCharArray()){
            if(c == ' '){
                idx = 1;
            }
            if(idx % 2 == 0){
                answer +=  Character.toUpperCase(c);
            }else{
                answer += Character.toLowerCase(c);
            }
            idx++;
        }
        return answer;
    }
}