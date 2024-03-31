import java.util.*;

public class Main {

    static void permutation(List<Character> v, int r, int d) {
        if (d == r) {
        	for (int i = 0; i < r; i++) {
                System.out.print(v.get(i) + " ");
            }
            System.out.println();
            return;
        }
        for (int i = d; i < v.size(); i++) {
            Collections.swap(v, i, d);
            permutation(v, r, d + 1);
            Collections.swap(v, i, d);
        }
    }

    public static void main(String[] args) {
        List<Character> v = new ArrayList<>();
        v.add('1');
        v.add('2');
        v.add('3');
        permutation(v, 3, 0);
    }
}
