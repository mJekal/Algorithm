class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int t = bandage[0];int x = bandage[1];int y = bandage[2];
        int len = attacks.length; int start = 0;int mx = health;
        int time = attacks[len-1][0];int temp=0;int idx = 0;
        for(int i = 0; i<len; i++){ 
            System.out.println(idx); 
            temp = attacks[i][0];
            int k = temp - start - 1;
            while(k-- > 0){
                idx++;
                if(idx>=t) {health+=y;idx=0;}
                System.out.println(idx);
                health += x;
                if(health > mx) health = mx;
            }
            start = temp;
            health -= attacks[i][1];
            idx=0;
            if(health<=0) return -1;
        }
        
        if(health<=0) return -1;
        return health;
    }
}