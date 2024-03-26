class Solution {
    public int solution(String dartResult) {
        int[] num = new int[3]; 
        int idx = 0;
        String nums = "";
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (c >= '0' && c <= '9') {
                nums += String.valueOf(c);
            } else if(c=='S'|| c=='D'|| c=='T'){
                    num[idx++] = Integer.parseInt(nums);
            if(c == 'S'){
                num[idx-1] = (int)Math.pow(num[idx-1],1);
            }else if(c == 'D'){
                num[idx-1] = (int)Math.pow(num[idx-1],2);
            }else{
                num[idx-1] = (int)Math.pow(num[idx-1],3);
            }
            nums = "";
            } else{
                if(c=='*'){
                    if(idx-2>=0){num[idx-2]*=2;}
                    num[idx-1] *= 2;
                }else if(c=='#'){
                    num[idx-1] *= -1;
                }
            }
        }
        int answer = num[0] + num[1] + num[2];
        return answer;
    }
}
