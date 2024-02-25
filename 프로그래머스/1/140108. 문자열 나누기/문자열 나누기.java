import java.util.*;
import java.io.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        String cpy = s;
        int same = 1; int diff = 0; int temp = 0;
        for(int i = 1; i<s.length(); i++){ 
            if(same==diff){answer++;
                cpy = cpy.substring(i-temp);
                same = 0; diff=0;
                x=s.charAt(i);
                temp = i;
            }
            if(x==s.charAt(i)){
                same++;
            }else{
                diff++;
            }

        }
       System.out.println(cpy+" "+same+" "+diff);
         if(same==diff){answer++;}
        if(cpy.length() != 0 && same!=diff){answer++;}
        return answer;
    }
}