import java.util.*;

class Solution {
    static int[] stage;
    static double[] fail;
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int people = stages.length;
        stage = new int[N+2];
        int[] st = new int[N+1];
        fail = new double[N+2];
        HashMap<Integer, Double> map = new HashMap<>();
        for(int num : stages){
            stage[num]++;
        }
        for(int i = 1; i<N+1; i++){
            int cur = 0;
            for(int j = 0; j<stages.length;j++){
                if(stages[j]>=i){
                    cur++;
                }
                st[i] = cur;
            }
        }
        for(int i = 1; i<N+1; i++){
            System.out.println(stage[i]);}
        for(int i = 1; i<N+1; i++){
           fail[i] = (double) stage[i] / st[i];
            if (st[i] == 0 || stage[i] == 0) {
                map.put(i, 0.0);
            } else {
           map.put(i, fail[i]);}
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
        for(int i = 0; i<N; i++){ 
            answer[i] = list.get(i); 
        }
        return answer;
    }
}