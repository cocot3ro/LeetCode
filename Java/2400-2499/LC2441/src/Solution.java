import java.util.Arrays;

public class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == 0) {
                return nums[right];
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        
        return -1;
    }
}