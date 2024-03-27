import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int integer : nums) {
            if (!set.add(integer)) {
                return integer;
            }
        }

        return -1;
    }
}
