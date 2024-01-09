import java.io.*;
import java.util.*;

public class Main {

	static Set<String> set = new HashSet<>();
	static List<String> board = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			board.add(s.substring(i));
		}
		Collections.sort(board, (e1, e2) -> e1.compareTo(e2));
		for (int i = 0; i < s.length(); i++) {
			System.out.println(board.get(i));
		}
	}
}