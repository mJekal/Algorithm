class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        String s = Integer.toString(n);
	        for(char c : s.toCharArray()) {
	        	answer += c - '0';
	        }
	        return answer;
	    }
	}