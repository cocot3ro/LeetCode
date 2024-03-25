public class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int count = 1;
        int max = 1;
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
                res = arr[i];
            }
        }
        return res;
    }
}