import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int j : nums1) {
            list1.add(j);
        }

        for (int j : nums2) {
            list2.add(j);
        }

        list1.retainAll(list2);

        return list1.stream().distinct().mapToInt(i -> i).toArray();
    }

//    public int[] intersection(int[] nums1, int[] nums2) {
//        List<Integer> result = new ArrayList<>();
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int i = 0, j = 0;
//        while (i < nums1.length && j < nums2.length) {
//            int num1 = nums1[i];
//            int num2 = nums2[j];
//            if (num1 == num2) {
//                if (result.isEmpty() || result.getLast() != num1) {
//                    result.add(num1);
//                }
//                i++;
//                j++;
//            } else if (num1 < num2) {
//                i++;
//            } else {
//                j++;
//            }
//        }
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }

}