import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> matrix = new LinkedList<>();
        matrix.add(new LinkedList<>());

        outer:
        for (Integer num : nums) {
            for (List<Integer> subList : matrix) {
                if (!subList.contains(num)) {
                    subList.add(num);
                    continue outer;
                }
            }

            matrix.add(new LinkedList<>(List.of(num)));
        }

        return matrix;
    }
}