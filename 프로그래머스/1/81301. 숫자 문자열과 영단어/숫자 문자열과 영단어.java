class Solution {
    
    static String[] index = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public int solution(String s) {

for (int i = 0; i < index.length; i++) {
    s = s.replace(index[i], Integer.toString(i));
}
        
        return Integer.parseInt(s);
    }
}