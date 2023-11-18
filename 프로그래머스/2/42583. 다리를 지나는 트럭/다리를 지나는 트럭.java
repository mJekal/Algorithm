import java.util.*;
class Solution {
		public int solution(int bridge_length, int weight, int[] truck_weights) {
			Queue<Integer> q = new LinkedList<>();
			for (int i = 0; i < bridge_length; i++) {
				q.add(0);
			}

			int index = 0;
			int day = 0;
			int bridge_weight = 0;
			while (index < truck_weights.length) {
				bridge_weight -= q.poll();
				int truck_weight = truck_weights[index];
				if (bridge_weight + truck_weight <= weight) {
					q.add(truck_weights[index]);
					bridge_weight += truck_weight;
					index++;
				} else {
					q.add(0);
				}
				day++;
			}
			while (bridge_weight > 0) {
				bridge_weight -= q.poll();
				day++;
			}

			return day;
		}
	}