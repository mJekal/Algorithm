import java.util.*;
class Solution {
    static String[] i = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    static int[] Month = {31,29,31,30,31,30,31,31,30,31,30,31};
    public String solution(int a, int b) {
        String answer = "";int sum = 0;
        for(int i = 1; i<a; i++){
            sum += Month[i-1];
        }
        sum+=(b-1);
        return i[sum%7];
    }
}