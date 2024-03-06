import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<players.length; i++){
            map.put(players[i],i);
        }
        for(String call: callings){
            int k = map.get(call);
            String str = players[k-1];
            map.replace(str,k);;
            players[k]=str;
            map.replace(call,k-1);
            players[k-1]=call;
        }
        return players;
    }
}