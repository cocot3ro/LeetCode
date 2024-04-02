import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .forEach(e -> sb.append(String.valueOf(e.getKey()).repeat(Math.max(0, e.getValue()))));

        return sb.toString();
    }
}
