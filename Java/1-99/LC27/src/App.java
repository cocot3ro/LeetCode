import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int[] expectedNums = { 2, 2 };
        int k = solution.removeElement(nums, val);

        if (k != expectedNums.length) {
            System.out.println(false);
            return;
        }
        Arrays.sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            if (nums[i] != expectedNums[i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
