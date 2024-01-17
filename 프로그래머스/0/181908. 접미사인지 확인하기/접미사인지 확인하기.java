class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len = my_string.length();
        String[] str = new String[len];
        for(int i =0 ; i<my_string.length(); i++){
            str[i] = my_string.substring(i);
        }
        for(int i =0 ; i<str.length; i++){
            if(str[i].equals(is_suffix)){
                answer = 1;
            }
        }
        return answer;
    }
}