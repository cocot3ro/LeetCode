public class Solution {

    public int[] maximizeXor(int[] nums, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0, max = -1; i < queries.length; i++, max = -1) {
            for (int j = 0; j < nums.length; j++) {
                if (queries[i][1] >= nums[j]) {
                    int xor = nums[j] ^ queries[i][0];
                    if (xor > max)
                        max = xor;
                }
            }
            answer[i] = max;
        }

        return answer;
    }
}
