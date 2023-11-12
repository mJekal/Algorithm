import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 0; i--) {
            int hIndex = citations.length - i;
            if (citations[i] >= hIndex) {
                answer = Math.min(citations[i], hIndex);
            } else {
                break;  // 더 이상 조건을 만족하는 값이 없다면 반복 중단
            }
        }

        return answer;
    }
}
