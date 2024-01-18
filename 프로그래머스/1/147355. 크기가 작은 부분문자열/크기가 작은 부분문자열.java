import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<=t.length()-p.length(); i++){
            list.add(t.substring(i,i+p.length()));
        }
        for(int i =0; i<list.size(); i++){
            long k = Long.parseLong(list.get(i));
            long k2 = Long.parseLong(p);
            if(k <= k2){
                answer++;
            }
        }
        
        return answer;
    }
}