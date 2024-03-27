public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] nums = { -3, -1, 0, 0, 0, 3, 3 };
        int[] expectedNums = { -3, -1, 0, 0, 3, 3 };

        int k = solution.removeDuplicates(nums);

        if (k != expectedNums.length) {
            System.out.println(false);
            return;
        }

        for (int i = 0; i < k; i++) {
            if (nums[i] != expectedNums[i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
