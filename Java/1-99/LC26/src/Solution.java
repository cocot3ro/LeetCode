import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueCounter = 0;

        Set<Integer> numsSet = new TreeSet<>();
        for (int num : nums) {
            if (numsSet.add(num)) {
                uniqueCounter++;
            }
        }

        int i = 0;
        for (Integer integer : numsSet) {
            nums[i++] = integer;
        }

        return uniqueCounter;
    }
}
