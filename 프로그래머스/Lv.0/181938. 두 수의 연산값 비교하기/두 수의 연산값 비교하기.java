class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = Integer.toString(a) + Integer.toString(b);
        int k = Integer.parseInt(c);
        if(k>=2*a*b) return k;
        return  2*a*b ;
    }
}