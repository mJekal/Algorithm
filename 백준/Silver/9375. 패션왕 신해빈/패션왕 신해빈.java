import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < TC; i++) {
			int mul = 1;
			int M = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			for (int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String type = st.nextToken();
				if (!map.containsKey(type)) {
					map.put(type, 1);
				} else {
					map.put(type, map.get(type) + 1);
				}
			}
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				mul *= (entry.getValue() + 1);
			}
			System.out.println(mul - 1);

		}
	}
}
