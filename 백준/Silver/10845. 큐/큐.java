import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int head, tail = 0;
	static int[] queue = new int[10000005];
	
	static void push(int item) {
		queue[tail++] = item;
	}
	
	static int pop() {
		if(tail == head) {
			return -1;
		}
		else {
		return queue[head++];
	}
	}
	
	static int size() {
		return tail - head;
	}
	
	static int empty() {
		if(tail == head) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	static int front() {
		if(tail == head) {
			return -1;
		}
		else {
			return queue[head];
		}
	}
	static int back() {
		if(tail == head) {
			return -1;
		}
		else {
			return queue[tail-1];
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			
			switch(S) {
			case "push" :
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop" :
				sb.append(pop()).append("\n");
				break;
			case "size" :
				sb.append(size()).append("\n");
				break;
			case "empty" :
				sb.append(empty()).append("\n");
				break;
			case "front" :
				sb.append(front()).append("\n");
				break;
			case "back" :
				sb.append(back()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}


}