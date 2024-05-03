import java.io.*;
import java.util.*;

public class Main {
    
        static void dfs(int start, List<Integer> nums, List<Integer> temp, int m, BufferedWriter bw) throws IOException {
        if (temp.size() == m) {
            for (int j = 0; j < temp.size(); j++) {
                bw.write(temp.get(j) + " ");
            }
            bw.newLine();
            return;
        }
        int remember = 0;
        for (int i = start; i < nums.size(); i++) {
            if (remember != nums.get(i)) {
                temp.add(nums.get(i));
                remember = nums.get(i);
                dfs(i, nums, temp, m, bw);
                temp.remove(temp.size() - 1);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] numsStr = br.readLine().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(numsStr[i]));
        }

        Collections.sort(nums); // Ensure nums is sorted

        List<Integer> temp = new ArrayList<>();
        dfs(0, nums, temp, m, bw);

        bw.flush();
        bw.close();
        br.close();
    }
}
