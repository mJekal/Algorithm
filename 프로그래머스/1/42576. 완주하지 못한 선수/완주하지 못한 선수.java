import java.util.*;

class Solution {
	Map<String, Integer> map = new HashMap<>();

	public String solution(String[] participant, String[] completion) {
		for (int i = 0; i < participant.length; i++) {
			map.putIfAbsent(participant[i], 0);
			map.put(participant[i], map.get(participant[i]) + 1);
		}
		for (int i = 0; i < completion.length; i++) {
			map.put(completion[i], map.get(completion[i]) - 1);
			if (map.get(completion[i]) == 0) {
				map.remove(completion[i]);
			}
		}
		return map.keySet().iterator().next();
	}
}