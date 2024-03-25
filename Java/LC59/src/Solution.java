public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 0;

        int top = 0;
        int bot = matrix.length;
        int left = 0;
        int rigth = matrix[0].length;

        for (int i = 0; i < n * n; i++) {
            for (int j = left; j < rigth; j++) {
                matrix[top][j] = ++num;
            }
            top++;

            for (int j = top; j < bot; j++) {
                matrix[j][rigth - 1] = ++num;
            }
            rigth--;

            for (int j = rigth - 1; j >= left; j--) {
                matrix[bot - 1][j] = ++num;
            }
            bot--;

            for (int j = bot - 1; j >= top; j--) {
                matrix[j][left] = ++num;
            }
            left++;
        }

        return matrix;
    }
}
