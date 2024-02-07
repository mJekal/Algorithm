class Solution {
    public int solution(int n) {
        int answer = 0; int count = 0;
      for(int i = 2; i<=n; i++){
        for(int j = 2; j*j<=i; j++){
             if(i%j==0){
                count++;
                break;
                }
            }
        }
        return n-1-count;
    }
}