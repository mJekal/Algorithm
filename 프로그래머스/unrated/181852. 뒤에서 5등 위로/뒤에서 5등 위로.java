import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] num_list) {
		int len = num_list.length;
		int[] answer = new int[len-5];
		Arrays.sort(num_list);
		for(int i = 5; i<len; i++) {
			answer[i-5] = num_list[i];
		}
		return answer;
	}
}