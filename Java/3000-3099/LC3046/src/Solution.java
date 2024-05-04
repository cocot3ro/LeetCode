public class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] counter = new int[100];

        for (int num : nums) {
            if (++counter[num - 1] > 2) return false;
        }

        return true;
    }
}