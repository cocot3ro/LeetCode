public class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            row[i] = sum;
        }

        for (int i = 0; i < mat[0].length; i++) {
            int sum = 0;
            for (int[] ints : mat) {
                sum += ints[i];
            }
            col[i] = sum;
        }

        for (int i = 0; i < mat.length; i++) {
            if (row[i] == 1) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == 1 && col[j] == 1) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}