import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((v1, v2) -> {
                    return Integer.parseInt(v2 + v1) - Integer.parseInt(v1 + v2);
                })
                .collect(Collectors.joining(""))
                .replaceAll("^0+", "0");
    }
}