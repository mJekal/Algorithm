import java.util.*;

class Solution {
    
    static Set<Integer> answer = new HashSet<>();
    
    static boolean[] vis = new boolean[10];
    
    static void back(int k, List<Integer> numbers) {


        if (isPrime(k)) {
                answer.add(k);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (!vis[i]) {
                int next_k = 10 * k + numbers.get(i);
                vis[i] = true;
                back(next_k, numbers);
                vis[i] = false;
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int solution(String numbers) {
        char[] numChars = numbers.toCharArray();
        List<Integer> numList = new ArrayList<>();
        for (char numChar : numChars) {
            numList.add(numChar - '0');
        }
        back(0, numList);
        return answer.size();
    }
}
