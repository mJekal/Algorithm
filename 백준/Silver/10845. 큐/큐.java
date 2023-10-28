import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	
	static Queue<Integer> queue = new LinkedList<>();
	static int tail;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			
			switch(S) {
			case "push" :
				tail = Integer.parseInt(st.nextToken());
				queue.offer(tail);
				break;
			case "pop" :
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
				sb.append(queue.poll()).append("\n");}
				break;
			case "size" :
				sb.append(queue.size()).append("\n");
				break;
			case "empty" :
				if(queue.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
				break;
			case "front" :
				if(queue.isEmpty()) sb.append(-1).append("\n");
				else sb.append(queue.peek()).append("\n");
				break;
			case "back" :
				if(queue.isEmpty()) sb.append(-1).append("\n");
				else sb.append(tail).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}


}