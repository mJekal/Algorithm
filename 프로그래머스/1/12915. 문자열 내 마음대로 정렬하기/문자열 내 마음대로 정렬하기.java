import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        Arrays.sort(answer, (e1, e2) -> {
            char char1 = e1.charAt(n);
            char char2 = e2.charAt(n);
            if (char1 != char2) {
                return Character.compare(char1, char2);
            } else {
                return e1.compareTo(e2);
            }
        });
        return answer;
    }
}