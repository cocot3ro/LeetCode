import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        int k = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                if (map.get(num) < 2) {
                    map.put(num, map.get(num) + 1);
                    k++;
                }
            } else {
                map.put(num, 1);
                k++;
            }
        }

        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        int i = 0;
        for (Entry<Integer,Integer> entry : entrySet) {
            for (int j = 0; j < entry.getValue(); j++) {
                nums[i++] = entry.getKey();
            }
        }

        return k;
    }
}
