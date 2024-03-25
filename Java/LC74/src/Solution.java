public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix[matrix.length - 1][matrix[0].length - 1] < target) {
            return false;
        }

        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            col = i;
            if (matrix[i][0] == target || matrix[i][matrix[i].length - 1] == target) {
                return true;
            } else if (matrix[i][0] < target && matrix[i][matrix[i].length - 1] > target) {
                break;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[col][i] == target) {
                return true;
            }
        }

        return false;
    }
}
