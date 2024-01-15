class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str = "";
        String str2 = "";
        for(int k : num_list){
            if(k % 2 == 0){
            str += Integer.toString(k);
         }else{
                str2 += Integer.toString(k);
            }
        }
        return Integer.parseInt(str) + Integer.parseInt(str2);
    }
}