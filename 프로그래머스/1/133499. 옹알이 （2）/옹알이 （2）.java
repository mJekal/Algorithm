class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String s : babbling){
            s = s.replaceAll("ayaaya|yeye|woowoo|mama","1");
            s = s.replaceAll("aya|ye|woo|ma","");
            if(s.length() == 0) answer++;
        }
        return answer;
    }
}