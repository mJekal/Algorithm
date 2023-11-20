import java.util.*;

class Solution {
    Set<Character> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    public String solution(String my_string) {
        for(char c : my_string.toCharArray()){
            if(set.contains(c)){
                continue;
            }
            set.add(c);
            sb.append(c);
        }return sb.toString();
    }
    
}