import java.util.*;
import java.io.*;

public class Main {
    static int sum;
    static int[] arr = new int[9];
    static int[] arr2 = new int[7];
    static int iindex;
    static int jindex;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            int k = Integer.parseInt(br.readLine());
            arr[i] = k;
        }

        int index;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                sum = 0;
                index = 0;
                iindex = i;
                jindex = j;
                for (int k = 0; k < 9; k++) {
                    if (k == iindex || k == jindex) {
                        continue;
                    }
                    sum += arr[k];
                    arr2[index++] = arr[k];
                }
                Arrays.sort(arr2);
                if (sum == 100) {
                    break;
                }
            }
            if (sum == 100) {
                break;
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(arr2[i]);
        }
    }
}