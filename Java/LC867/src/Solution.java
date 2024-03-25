public class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            int[] row = new int[matrix.length];

            for (int j = 0; j < matrix.length; j++) {
                row[j] = matrix[j][i];
            }

            ans[i] = row;
        }

        return ans;
    }
}
