import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	
	static int[] stack = new int[10000000];
	static int top = -1;
	
	static void push(int x) {
		stack[++top] = x;
	}
	
	static int pop() {
                if (top == -1) {
            return -1;
        }
		return stack[top--];
		
	}
	
	static int size() {
		return top+1;
		
	}
	
	static int empty() {
		if(top == -1) {
			return 1;
		} else {
			return 0;
		}
	}
	
	static int top() {
		if(top == -1) {
			return -1;
		}
		return stack[top];
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			switch(str) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
			 sb.append(empty()).append("\n");
			 break;
			case "top":
			sb.append(top()).append("\n");
				break;
					
			}
        }
			System.out.println(sb);
			

	}
}
