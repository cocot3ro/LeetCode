public class LC3066 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 11, 10, 1, 3};
        int k = 10;

        System.out.println(solution.minOperations(nums, k));

        nums = new int[]{1, 1, 2, 4, 9};
        k = 20;

        System.out.println(solution.minOperations(nums, k));

        nums = new int[]{1_000_000_000, 999_999_999, 1_000_000_000, 999_999_999, 1_000_000_000, 999_999_999};
        k = 1_000_000_000;

        System.out.println(solution.minOperations(nums, k));
    }
}
