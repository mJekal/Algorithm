class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp = 0;
        if(n > m){
            int t = n;
            n = m;
            m = t;
        }
        for(int i =1; i<=m; i++){
            if(n % i == 0 && m % i ==0){
                temp = i;
            }
        }
        answer[0] = temp;
        answer[1] = temp * (n/temp)*(m / temp);
        return answer;
    }
}