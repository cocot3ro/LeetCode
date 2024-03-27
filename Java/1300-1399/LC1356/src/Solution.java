import java.util.*;

public class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, Map<Integer, Integer>> map = new TreeMap<>();

        for (int i : arr) {
            int count = Integer.bitCount(i);
            Map<Integer, Integer> subMap = map.get(count);
            if (subMap == null) {
                map.put(count, new TreeMap<>(Map.of(i, 1)));
            } else {
                subMap.put(i, subMap.getOrDefault(i, 0) + 1);
            }
        }

        int idx = 0;
        for (Map.Entry<Integer, Map<Integer, Integer>> subMap : map.entrySet()) {
            for (Map.Entry<Integer, Integer> subSubMap : subMap.getValue().entrySet()) {
                for (int i = 0; i < subSubMap.getValue(); i++) {
                    arr[idx++] = subSubMap.getKey();
                }
            }
        }
        return arr;
    }
}
