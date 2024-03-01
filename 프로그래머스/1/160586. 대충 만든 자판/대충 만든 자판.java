import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<keymap. length; i++){
            String str = keymap[i];
            for(int j = 0; j<str.length();j++){
                String temp = Character.toString(str.charAt(j));
                if(!map.containsKey(temp) || map.get(temp)>j){
                 map.put(Character.toString(str.charAt(j)),j+1);
                } }}
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (char c : targets[i].toCharArray()) {
                String temp = Character.toString(c);
                if (map.containsKey(temp)) {
                    sum += map.get(temp);
                } else {
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}
