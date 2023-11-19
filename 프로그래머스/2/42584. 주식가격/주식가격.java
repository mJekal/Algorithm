import java.util.*;

class Solution {
        static int[] prices;
        static Stack<Integer> stack = new Stack<>();
        static int[] result;
		
        public int[] solution(int[] prices) {
			result = new int[prices.length];

			for (int i = 0; i < prices.length; i++) {

				while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
					int index = stack.pop();
					result[index] = i - index;
				}
				stack.push(i);
			}

			while (!stack.isEmpty()) {
                int indx = stack.pop();
				result[indx] = prices.length - 1 - indx;
			}
			return result;
		}
	}