import java.util.List;

public class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int size = nums.size();
        if (nums.size() == k) {
            return k;
        }

        boolean[] seen = new boolean[k];

        int cont = 0;
        int kCont = 0;
        for (int i = size - 1; i >= 0 && kCont < k; i--) {
            cont++;
            int num = nums.get(i);
            if (num <= k) {
                if (!seen[num - 1]) {
                    kCont++;
                    seen[num - 1] = true;
                }
            }
        }

        return cont;
    }
}
