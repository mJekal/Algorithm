import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i =0; i<photo.length; i++){
            int sum = 0;
            for(int j =0 ; j<photo[i].length; j++){
                if(Arrays.asList(name).contains(photo[i][j])){
                    int k = Arrays.asList(name).indexOf(photo[i][j]);
                    
                    sum += yearning[k];
                } 
            }
            answer[i] = sum;
        }
        return answer;
    }
}