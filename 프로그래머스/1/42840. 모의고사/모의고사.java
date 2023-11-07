import java.util.stream.IntStream;

class Solution {
    static int[] answer;
    static int min_size,index, cnt;
    static int[][] person = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

   static int count(int[] answers, int[] person) {
        for (int i = 0; i < answers.length; i++) {
            if (index > person.length - 1) { index = index % person.length; }
            if (answers[i] == person[index++]) {
                
                cnt++;
            }
        }
        return cnt;
    }
    
    public int[] solution(int[] answers) {
        min_size = 0;
        answer = new int[3];
        for (int i = 0; i < 3; i++) {
            answer[i] = count(answers, person[i]);
            index = 0;
            cnt = 0;
            if (min_size < answer[i]) {min_size = answer[i];}
        }
        return IntStream.range(0,3).filter(i->answer[i]==min_size).map(i->i+1).toArray();
    }
}
