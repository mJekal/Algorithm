class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(char c : rsp.toCharArray()){
            int k = c - '0';
            switch(k){
                case 2:
                    answer+=Integer.toString(0);
                    break;
                case 0:
                    answer+=Integer.toString(5);
                    break;
                case 5:
                    answer+=Integer.toString(2);
                    break;
            }
        }
        return answer;
    }
}