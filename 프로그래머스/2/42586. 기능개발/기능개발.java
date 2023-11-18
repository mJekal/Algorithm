import java.util.*;

	class Solution {
		public static int[] solution(int[] progresses, int[] speeds) {
			int count = 0;
			Queue<Integer> q = new LinkedList<>();
			List<Integer> result = new ArrayList<>();

			for (int i = 0; i < progresses.length; i++) {
				q.add(i);
			}
			int day = 0;
			while (!q.isEmpty()) {
				int cur = q.poll();

				int expection = (int) Math.ceil((double) (100 - progresses[cur]) / speeds[cur]);
				if (expection > day) {
					if (day != 0) {
						result.add(count);
						count = 0;
					}
					day = expection;
				}
				count++;
			}
			result.add(count);
			return result.stream().mapToInt(Integer::intValue).toArray();
		}
	}