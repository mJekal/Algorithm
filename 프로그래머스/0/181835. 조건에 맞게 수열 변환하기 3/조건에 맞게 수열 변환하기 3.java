class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int index =0;
        if(k % 2 == 0){
            for(int num : arr){
                answer[index++] = num+k;
            }
        }else{ for(int num : arr){
            answer[index++] = num*k; }
        }
        return answer;
    }
}