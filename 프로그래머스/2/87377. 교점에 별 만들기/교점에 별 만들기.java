import java.util.*;
import java.io.*;

public class Solution {
static class Pair{
    long x,y;
    Pair(long x, long y){
        this.x = x;
        this.y = y;
    }
}

Pair Intersection(long a1, long a2, long a3, long b1, long b2, long b3){

    if (a1 * b2 - a2 * b1 == 0) {
        return null;
    }
    double x = (double)(a2*b3 - a3*b2)/(a1*b2-a2*b1);
    double y = (double)(a3*b1 - a1*b3)/(a1*b2-a2*b1);
    if(x%1!=0 || y%1 != 0) return null;
    return new Pair((long)x,(long) y);
}

Pair mini(List<Pair> list){
    
    long x = Long.MAX_VALUE;
    long y = Long.MAX_VALUE;
    for(Pair p : list){
    if(x > p.x) x = p.x;
    if(y > p.y) y = p.y;
}
    return new Pair(x,y);
}

Pair maxi(List<Pair> list){
    long x = Long.MIN_VALUE;
    long y = Long.MIN_VALUE;
    for(Pair p : list){
    if(x < p.x) x = p.x;
    if(y < p.y) y = p.y;
}
    return new Pair(x, y);
}

    public String[] solution(int[][] line) {
        List<Pair> ans = new ArrayList<>();
        for(int i = 0; i<line.length; i++){
            for(int j = i+1; j<line.length; j++){
                Pair Point = Intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
                if(Point != null) ans.add(Point);
            }
        }
    
    
    Pair mini = mini(ans);
    Pair maxi = maxi(ans);
    
    int width = (int)(maxi.y - mini.y + 1);
    int height = (int)(maxi.x - mini.x + 1);
        
    char[][] board = new char[width][height];
    for(char[] row : board){
        Arrays.fill(row, '.');
    }

        for(Pair p : ans){
int x = (int)(p.x - mini.x);
int y = (int)(maxi.y - p.y);
board[y][x] = '*';


}

        
        String[] answer = new String[board.length];
        for(int i = 0; i<board.length; i++){
            answer[i] = new String(board[i]);
        }        

        return answer;
    }
}
