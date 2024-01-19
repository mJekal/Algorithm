class Solution {
    public int solution(int[][] sizes) {
        int answer = 1;
        int k = -1; int t = -1;
        int len = sizes.length;
        for(int i = 0; i<len; i++){
                int kk = Math.max(sizes[i][0], sizes[i][1]);
                int tt = Math.min(sizes[i][0], sizes[i][1]);
                sizes[i][0] = kk;
                sizes[i][1] = tt;
            }
        for(int i = 0; i<len; i++){
            k = Math.max(sizes[i][0], k);
            t = Math.max(sizes[i][1], t);
        }
        return k*t;
    }
}