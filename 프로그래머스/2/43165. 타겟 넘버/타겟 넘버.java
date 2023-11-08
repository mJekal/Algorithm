class Solution {
    static int cnt;
    static void back(int k, int num, int len, int[] numbers, int target) {
        if (k == len) {
            if (target == num) {
                cnt++;
            }
            return;
        }
        back(k + 1, num + numbers[k], len, numbers, target);
        back(k + 1, num - numbers[k], len, numbers, target);
    }
    public int solution(int[] numbers, int target) {
        cnt = 0;
        back(0, 0, numbers.length, numbers, target);
        return cnt;
    }
}
