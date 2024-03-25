import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // nums1 = [1,2,2,1], nums2 = [2,2]
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(solution.intersection(nums1, nums2)));
    }
}
