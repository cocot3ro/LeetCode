import java.util.Arrays

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val nums3 = IntArray(nums1.size + nums2.size)

        System.arraycopy(nums1, 0, nums3, 0, nums1.size)
        System.arraycopy(nums2, 0, nums3, nums1.size, nums2.size)

        Arrays.sort(nums3)

        return if (nums3.size % 2 == 0) {
            (nums3[nums3.size / 2 - 1] + nums3[nums3.size / 2]) / 2.0
        } else {
            nums3[nums3.size / 2].toDouble()
        }
    }
}
