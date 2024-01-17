class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String[] ans = my_string.split(" ");
        int cnt = 0;
        for(String c : ans){
            if(c.equals("")==false){
                cnt++;
            }
        }
        answer = new String[cnt];
        int index = 0;
        for(String str : ans){
            if(str.equals("") == false){
               answer[index++] = str;
            }
        }
        return answer;
    }
}