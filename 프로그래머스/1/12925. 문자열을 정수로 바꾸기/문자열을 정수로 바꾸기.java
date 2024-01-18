class Solution {
    public int solution(String s) {
        boolean isPlus = true;
        for(char c : s.toCharArray()){
            if(c == '-'){
                isPlus = false;
            }
        }
        int k = Integer.parseInt(s);
        if(isPlus == false){
            k *= -1;
        }
        return Integer.parseInt(s);
    }
}
