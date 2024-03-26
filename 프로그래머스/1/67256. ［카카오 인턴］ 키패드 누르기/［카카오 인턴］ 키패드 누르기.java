class Solution {
    class Pair{
        int x, y, z;
        Pair(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    Pair Phone = new Pair(10,12,-1);
    public String solution(int[] numbers, String hand) {
        String answer = "";
        for(int i = 0; i<numbers.length; i++){
            int k = numbers[i];
            if(k == 1 || k == 4 || k == 7){
                Phone.z = 0;
                Phone.x = k;
            } else if(k == 3 || k == 6 || k == 9){
                Phone.z = 1;
                Phone.y = k;
            } else {
            if( k == 0 ) k = 11;
            int lD = (Math.abs(k - Phone.x) / 3) + (Math.abs(k - Phone.x) % 3);
            int rD =(Math.abs(k - Phone.y) / 3) + (Math.abs(k - Phone.y) % 3);
            if(lD<rD){
                    Phone.z = 0;
                    Phone.x = k;
            }else if(lD>rD){
                    Phone.z = 1;
                    Phone.y = k;
            }else{
                if(hand.equals("left")){
                    Phone.z = 0;
                    Phone.x = k;
                }else{
                    Phone.z = 1;
                    Phone.y = k; 
                }
            }
            }
            System.out.println(i+" " + Phone.x+" " + Phone.y);
            if(Phone.z == 0){
                answer += "L";
            } else {
                answer += "R";
            }
        }
        return answer;
    }
}
