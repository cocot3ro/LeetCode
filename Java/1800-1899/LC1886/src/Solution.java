import java.util.Arrays;

public class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if (Arrays.deepEquals(mat, target)) {
            return true;
        }

        for (int i = 0; i < 3; i++) {
            this.rotate(mat);
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
        }
        return false;
    }
    private void rotate(int[][] matrix) {
        for (int level = 0; level < matrix.length / 2; level++) {
            int tmp = matrix[level][level];
            matrix[level][level] = matrix[matrix.length - 1 - level][level];
            matrix[matrix.length - 1 - level][level] = matrix[matrix.length - 1 - level][matrix.length - 1 - level];
            matrix[matrix.length - 1 - level][matrix.length - 1 - level] = matrix[level][matrix.length - 1 - level];
            matrix[level][matrix.length - 1 - level] = tmp;

            for (int i = 1; i <= matrix.length - 2 - (level * 2); i++) {
                tmp = matrix[level][i + level];
                matrix[level][i + level] = matrix[matrix.length - 1 - i - level][level];
                matrix[matrix.length - 1 - i - level][level] = matrix[matrix.length - 1 - level][matrix.length - 1 - i - level];
                matrix[matrix.length - 1 - level][matrix.length - 1 - i - level] = matrix[i + level][matrix.length - 1 - level];
                matrix[i + level][matrix.length - 1 - level] = tmp;
            }

        }
    }
}
