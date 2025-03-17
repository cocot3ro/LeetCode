public class Solution {
    public boolean divideArray(int[] nums) {
        int[] aux = new int[500];

        for(int i : nums) {
            aux[i - 1]++;
        }

        for(int i : aux) {
            if(i % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}