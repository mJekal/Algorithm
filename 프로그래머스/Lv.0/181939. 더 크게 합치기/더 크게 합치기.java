class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = Integer.toString(a) + Integer.toString(b);
        String aaa = Integer.toString(b) + Integer.toString(a);
        int k1 = Integer.parseInt(aa);
        int k2 = Integer.parseInt(aaa);
        return k1 >= k2 ? k1:k2 ;
    }
}