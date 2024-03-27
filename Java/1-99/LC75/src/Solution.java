import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
        }

        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (int i = entry.getValue(); i > 0; i--) {
                nums[index++] = entry.getKey();
            }
        }

    }
}
