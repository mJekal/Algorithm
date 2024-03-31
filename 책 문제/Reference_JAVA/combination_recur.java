import java.util.*;

public class Main {
	
    static List<Character> v = List.of('1', '2', '3', '4', '5');
    static int k = 3;

    static void combi(int start, List<Character> s) {
        if (s.size() == k) {
            for (char c : s) {
                System.out.print(c);
            }
            System.out.println();
            return;
        }

        for (int i = start + 1; i < v.size(); i++) {
            s.add(v.get(i));
            combi(i, s);
            s.remove(s.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<Character> s = new ArrayList<>();
        combi(-1, s);
    }
}
