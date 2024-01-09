import java.io.*;
import java.util.*;

public class Main {

	static int N;
	static Map<Integer, List<String>> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int key = Integer.parseInt(st.nextToken());
			String value = st.nextToken();
			if (map.containsKey(key)) {
				List<String> values = map.get(key);
				values.add(value);
				map.put(key, values);
			} else {
				List<String> values = new ArrayList<>();
				values.add(value);
				map.put(key, values);
			}
		}

		for (Integer key : map.keySet()) {
			for (String value : map.get(key)) {
				System.out.println(key + " " + value);
			}
		}
	}
}