import java.util.*;
import java.io.*;

public class Main {

	static class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Stack<Pair> tower = new Stack<>();
		tower.push(new Pair(100000001, 0));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			int height = Integer.parseInt(st.nextToken());
			while (tower.peek().x < height) {
				tower.pop();
			}
			bw.write(tower.peek().y + " ");
			tower.push(new Pair(height, i));
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
