import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> stack  = new ArrayList<>();
        for(int j = 0; j<moves.length; j++){
            int c = moves[j];
            for(int i = 0; i<board.length; i++){
                if(board[i][c-1]==0) continue; 
                stack.add(board[i][c-1]);
                if(stack.size()>=2 && stack.get(stack.size()-2)==stack.get(stack.size()-1)){
                  stack.remove(stack.size()-2);
                  stack.remove(stack.size()-1);
                  answer+=2;
                }
                board[i][c-1] = 0;

                break;
            }
        } 
        return answer;
    }
}
