class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] ans = new String[my_string.length()];
        for(int i =1; i<=my_string.length(); i++){
            ans[i-1] = my_string.substring(0,i); 
        }
        for(String str : ans){
            if(str.equals(is_prefix)){
                answer = 1;
            } 
        }
        return answer;
    }
}