import java.io.*;
import java.util.*;

public class Main {

	static HashMap<Integer, String> map = new HashMap<>();
	static HashMap<String, Integer> map2 = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			map.put(i, str);
			map2.put(str, i);
		}
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if ('1' <= str.charAt(0) && str.charAt(0) <= '9') {
				int k = Integer.parseInt(str);
				System.out.println(map.get(k-1));
			} else {
				System.out.println(map2.get(str)+1);
			}
		}
	}
}
