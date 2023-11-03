class Solution {
   
    char push(char c, int n){
        char offset = Character.isUpperCase(c)? 'A':'a';
        if(c != ' ') {
            c = (char)((c - offset + n) % 26 + offset);
            if (c < offset) {
                c += 26;
            }
            return c;
        }
        return c;
    }
    
    public String solution(String s, int n) {
        char[] split = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < split.length; i++){
            sb.append(push(split[i], n));
        }
        return sb.toString();
    }
}

