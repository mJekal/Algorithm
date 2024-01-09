import java.io.*;
import java.util.*;

public class Main {

	static Set<String> set = new HashSet<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			set.add(s);
		}
		List<String> setL = new ArrayList<>(set);
		Collections.sort(setL, (s1, s2) -> {
			int len = s1.length() - s2.length();
			if (len == 0) {
				return s1.compareTo(s2);
			}
			return len;
		});
		for(int i =0 ; i<setL.size();i++) {
			System.out.println(setL.get(i));
		}
	}
}