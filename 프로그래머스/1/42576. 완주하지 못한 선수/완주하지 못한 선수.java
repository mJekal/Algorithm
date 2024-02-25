import java.util.*;
import java.io.*;

class Solution {
    static HashMap<String, Integer> map = new HashMap<>();
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        for(String part : participant){
            map.put(part, map.getOrDefault(part,0)+1);
        }
        for(String part : completion){
            map.put(part, map.get(part)-1);
        }
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if(entry.getValue() != 0){
                return entry.getKey();
            }
        }
        return answer;
    }
}