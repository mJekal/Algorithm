class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int p_cnt = s.length() - s.replace("p","").length();
        int y_cnt = s.length() - s.replace("y","").length();

        return p_cnt == y_cnt;
    }
}
