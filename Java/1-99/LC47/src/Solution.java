import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return ans;
        }

        List<Integer> current = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];

        Arrays.sort(nums);

        backtrack(ans, current, nums, visited);

        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> current, int[] nums, boolean[] visited) {
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                continue;
            }

            visited[i] = true;
            current.add(nums[i]);

            backtrack(ans, current, nums, visited);

            visited[i] = false;
            current.removeLast();
        }
    }
}