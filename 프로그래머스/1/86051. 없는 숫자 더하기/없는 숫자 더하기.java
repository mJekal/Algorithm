class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10];
        for(int num : numbers){
            arr[num] = 1;
        }
        for(int i = 0; i<=9; i++){
            if(arr[i] == 0) answer+=i;
        }
        return answer;
    }
}