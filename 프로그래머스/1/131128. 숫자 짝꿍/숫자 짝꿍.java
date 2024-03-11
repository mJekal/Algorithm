class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        for(char C : X.toCharArray()){
            cntX[C-'0']++;
        }
        for(char C : Y.toCharArray()){
            cntY[C-'0']++;
        }
        for(int i = 9; i>=0; i--){
            int k = Math.min(cntX[i],cntY[i]);
            while(k-->0){
                sb.append(i);
            }
        }
        String answer = sb.toString();
        if (answer.isEmpty()) {
            return "-1";
        }
        if (answer.charAt(0) == '0') {
            return "0";
        }
        return answer;
    }
}
