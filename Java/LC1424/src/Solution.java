import java.util.*;

public class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, Stack<Integer>> map = new LinkedHashMap<>();

        int row = 0;
        int items = 0;
        for (List<Integer> subList : nums) {
            for (int i = 0, size = subList.size(); i < size; i++) {
                if (!map.containsKey(row + i)) {
                    map.put(row + i, new Stack<>());
                }
                map.get(row + i).add(subList.get(i));
                items++;
            }
            row++;
        }

        int[] ans = new int[items];
        int idx = 0;
        for (Stack<Integer> stack : map.values()) {
            while (!stack.isEmpty()) {
                ans[idx++] = stack.pop();
            }
        }

        return ans;
    }
}