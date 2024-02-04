import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int mn = Integer.MAX_VALUE;
        int[] board = new int[k];
        if(k>score.length){
            for(int i =0 ;i<score.length; i++){
                board[i] = score[i];
                mn = Math.min(board[i],mn);
                answer[i] = mn;
            }
        }else{
        for(int i = 0; i<k; i++){
            board[i] = score[i];
            mn = Math.min(board[i],mn);
            answer[i] = mn;
        }}
        Arrays.sort(board);
        for(int i = k; i<score.length; i++){  
            if(score[i]>board[0]){
                board[0] = score[i];
            }
            Arrays.sort(board);
            answer[i] =  board[0];
        }
        return answer;
    }
}