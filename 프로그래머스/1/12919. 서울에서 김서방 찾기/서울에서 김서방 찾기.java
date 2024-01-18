class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int k = 0;
        int ans = 0;
        for(String str : seoul){
            if(str.equals("Kim")){
                ans = k; 
            }
            k++;
        }
        answer ="김서방은 " + Integer.toString(ans) + "에 있다";
        return answer;
    }
}