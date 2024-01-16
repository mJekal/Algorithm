class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        System.out.println(myString.contains(pat));
        return myString.contains(pat) ? 1: 0;

    }
}