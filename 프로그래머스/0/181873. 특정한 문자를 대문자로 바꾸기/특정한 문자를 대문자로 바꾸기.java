class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(char c : my_string.toCharArray()){
            if(c==alp.charAt(0)){
            char ch = Character.toUpperCase(c);
               my_string = my_string.replace(Character.toString(c),Character.toString(ch));}
        }
        return my_string;
    }
}