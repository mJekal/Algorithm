import java.util.*;

class Solution {
    static int idx = 0;
    static int exts = 0;
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] sorts = {"code", "date", "maximum", "remain"};
        List<int[]> datas = new ArrayList<>(Arrays.asList(data));
        for (int i = 0; i < 4; i++) {
            if (sorts[i].equals(sort_by)) {  
                idx = i;
            }
            if (sorts[i].equals(ext)) {  
                exts = i;
            }
        }
        List<int[]> filter = new ArrayList<>();
        for (int[] row : datas) {
            if (row[exts] < val_ext) {
                filter.add(row);
            }
        }
        Collections.sort(filter, (o1, o2) -> o1[idx] - o2[idx]);
        int[][] answer = new int[filter.size()][data[0].length];
        for (int i = 0; i < filter.size(); i++) {
            answer[i] = filter.get(i);
        }
        return answer;
    }
}
