class Solution {
    static int[][] board;
    static void func(int i, int k, int n){
        String temp = "";
        while(k>0){ 
            int a = k % 2;
            k /= 2;
            temp += Integer.toString(a);
        }
            for(int j = temp.length(); j>0; j--){
                if(temp.charAt(temp.length()-j)-'0' == 1){
            board[i][n-1] = temp.charAt(temp.length()-j)-'0';}
                n--;
        }
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        board = new int[n][n];
        for(int i = 0; i<n ; i++){
            func(i, arr1[i],n);
        func(i,arr2[i],n);}
        for(int i = 0; i<n; i++){
            String ans = "";
            for(int j = 0; j<n; j++){
                if(board[i][j]==1){
                    ans +="#";
                }else{
                    ans +=" ";
                }
            }
            answer[i] = ans;
        }
        return answer;
    }
}