public class Solution {
    public void rotate(int[][] matrix) {
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
