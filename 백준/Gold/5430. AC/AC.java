import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            Deque<Integer> dq = new ArrayDeque<>();
            int rev = 0;
            boolean isWrong = false;

            String query = br.readLine();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            for (int i = 0; i < n; i++) {
                dq.add(Integer.parseInt(st.nextToken()));
            }

            for (char c : query.toCharArray()) {
                if (c == 'R') {
                    rev = 1 - rev;
                } else {
                    if (dq.isEmpty()) {
                        isWrong = true;
                        break;
                    }
                    if (rev != 1) {
                        dq.pollFirst();
                    } else {
                        dq.pollLast();
                    }
                }
            }

            if (isWrong) {
                System.out.println("error");
            } else {
                StringBuilder result = new StringBuilder("[");
                if (rev == 1) {
                    while (!dq.isEmpty()) {
                        result.append(dq.pollLast());
                        if (!dq.isEmpty()) {
                            result.append(",");
                        }
                    }
                } else {
                    while (!dq.isEmpty()) {
                        result.append(dq.pollFirst());
                        if (!dq.isEmpty()) {
                            result.append(",");
                        }
                    }
                }
                result.append("]");
                System.out.println(result);
            }
        }
    }
}
