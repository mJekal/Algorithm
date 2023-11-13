import java.util.*;
import java.io.*;

public class Main {
	static int[] people = new int[31];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i < 29; i++) {
			people[Integer.parseInt(br.readLine())] = 1;
		}

		for (int i = 1; i < 31; i++) {
			if (people[i] == 0) {
				System.out.println(i);
			}
		}

	}
}