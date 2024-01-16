class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int cnt = 0;
        for(boolean bool : finished){
            if(bool==false){
                cnt++;
            }
        }
        answer = new String[cnt];
        int index =0 ;
        for(int i =0; i<finished.length; i++){
            if(finished[i]==false){
                answer[index++] = todo_list[i];
            }
        }
        return answer;
    }
}