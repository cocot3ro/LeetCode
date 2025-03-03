import java.util.Arrays;

public class LC2161 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;

        System.out.println(Arrays.toString(solution.pivotArray(nums, pivot)));

        nums = new int[]{-3, 4, 3, 2};
        pivot = 2;

        System.out.println(Arrays.toString(solution.pivotArray(nums, pivot)));
    }
}
