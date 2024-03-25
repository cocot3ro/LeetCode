import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new LinkedList<>();

        int top = 0;
        int bot = matrix.length;

        int left = 0;
        int rigth = matrix[0].length;

        while (ans.size() < matrix.length * matrix[0].length) {
            for (int i = left; i < rigth && ans.size() < matrix.length * matrix[0].length; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i < bot && ans.size() < matrix.length * matrix[0].length; i++) {
                ans.add(matrix[i][rigth - 1]);
            }
            rigth--;

            for (int i = rigth - 1; i >= left && ans.size() < matrix.length * matrix[0].length; i--) {
                ans.add(matrix[bot - 1][i]);
            }
            bot--;

            for (int i = bot - 1; i >= top && ans.size() < matrix.length * matrix[0].length; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }

        return ans;
    }
}
