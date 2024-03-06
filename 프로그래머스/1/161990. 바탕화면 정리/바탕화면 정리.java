import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int dxMx = 0; int dxMn = 51; int dyMx = 0; int dyMn = 51;
        for(int i = 0; i<wallpaper.length; i++){
          for(int j = 0; j<wallpaper[0].length(); j++){
              if(wallpaper[i].charAt(j)=='#'){
                   dxMn = Math.min(dxMn,i);
                   dyMn = Math.min(dyMn,j);
                   dxMx = Math.max(dxMx,i);
                   dyMx = Math.max(dyMx,j);
              }
        }
        }
        answer[0] = dxMn;
        answer[1] = dyMn;
        answer[2] = dxMx+1;
        answer[3] = dyMx+1;
        return answer;
    }
}