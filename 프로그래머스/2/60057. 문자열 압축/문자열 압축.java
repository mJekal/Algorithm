import java.util.*;

class Solution {
    List<String> split (String s, int length){
    List<String> token = new ArrayList<>(); 
    for(int StartIndex = 0; StartIndex < s.length(); StartIndex+=length){
      int EndIndex = StartIndex + length;
    if(EndIndex > s.length() ){ EndIndex = s.length();}
        token.add(s.substring(StartIndex,EndIndex));
    }
    return token;
}

int compress(String s, int length){
   int cnt = 0;
    String last = "";
    StringBuilder sb = new StringBuilder();
    for(String token : split(s,length)){
        if(token.equals(last)) cnt++;
        else{
            if(cnt>1) sb.append(cnt);
                sb.append(last);
                cnt = 1;
                last = token;
            }
        }
        if(cnt>1){sb.append(cnt);}
        sb.append(last);
    return sb.length();
} 
    
    public int solution(String s) {
        int min = Integer.MAX_VALUE;
        for(int length = 1; length<=s.length(); length++){
            int answer = compress(s, length);
            if(min>answer){
                min = answer;
            }
}
        return min;
    }
}