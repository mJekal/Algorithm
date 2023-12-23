import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		if (90 <= score & score <= 100) {
			System.out.println('A');
		} else if (80 <= score) {
			System.out.println('B');
		} else if (70 <= score) {
			System.out.println('C');
		} else if (60 <= score) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	}
}
