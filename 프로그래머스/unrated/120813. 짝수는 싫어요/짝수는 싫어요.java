class Solution {
    public int[] solution(int n) {
        int k = 0;
        if(n%2 == 0){
            k = n/2;
        }else{
            k = (n+1)/2;
        }
        int index = 0;
        int[] answer = new int[k];
        for(int i = 0; i<=n; i++){
            if(i % 2 == 1){
                answer[index++] = i;
            }
        }
        return answer;
    }
}