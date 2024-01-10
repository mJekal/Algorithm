import java.io.*;
import java.util.*;

public class Main {

	static class Student {
		String name;
		int Ko, En, Math;

		Student(String name, int Ko, int En, int Math) {
			this.name = name;
			this.Ko = Ko;
			this.En = En;
			this.Math = Math;
		}
	}

	static Map<String, List<Integer>> board = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Student> score = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			score.add(new Student(s, a, b, c));
		}
		Collections.sort(score, (e1, e2) -> {
			int KoComp = e2.Ko - e1.Ko;
			if (KoComp == 0) {
				int EnComp = e1.En - e2.En;
				if (EnComp == 0) {
					int MaComp = e2.Math - e1.Math;
					if (MaComp == 0) {
						return e1.name.compareTo(e2.name);
					} else {
						return MaComp;
					}
				} else {
					return EnComp;
				}
			} else {
				return KoComp;
			}
		});
		for (Student student : score) {
			System.out.println(student.name + " ");
		}
	}
}