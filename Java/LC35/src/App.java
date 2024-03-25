public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 3, 5, 6};
        int target = 5;

        System.out.println(solution.searchInsert(nums, target));

        target = 2;
        System.out.println(solution.searchInsert(nums, target));

        target = 7;
        System.out.println(solution.searchInsert(nums, target));
    }
}
