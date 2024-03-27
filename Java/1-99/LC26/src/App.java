public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] nums = { 1, 1, 2 };
        int[] expectedNums = { 1, 2 };

        int k = solution.removeDuplicates(nums);

        if (k != expectedNums.length) {
            System.out.println("false");
            return;
        }
        for (int i = 0; i < k; i++) {
            if (nums[i] != expectedNums[i]) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
