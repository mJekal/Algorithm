class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(); 
        boolean ToUpper = true;
        for(char c: s.toCharArray()){
            if(c == ' '){
                sb.append(c);
                ToUpper = true;
            } else{
                if(ToUpper==true){
                    sb.append(Character.toUpperCase(c));
            } else if(ToUpper==false){
                    sb.append(Character.toLowerCase(c));
            } 
                ToUpper = !ToUpper;
            
           
        }
        }
        String answer = sb.toString();
        return answer;
    
}
}