import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<Character> str = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            str.add(s.charAt(i));
        }
        Collections.sort(str);
        for(int i = str.size() -1; i>=0; i--){
            answer+=str.get(i);}
        return answer;
    }
}