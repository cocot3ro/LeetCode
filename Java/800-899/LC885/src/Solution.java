public class Solution {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows * cols][2];

        int curr_row = rStart;
        int curr_col = cStart;

        int timesRigth = 1;
        int timesBot = 1;
        int timesLeft = 2;
        int timesTop = 2;

        for (int index = 0; index < rows * cols;) {
            System.out.println(index);
            for (int j = 0; j < timesRigth && index < rows * cols; j++) {
                if (inTheMatrix(rows, curr_row, cols, curr_col))
                    ans[index++] = new int[] { curr_row, curr_col };
                curr_col++;
            }
            timesRigth += 2;

            for (int j = 0; j < timesBot && index < rows * cols; j++) {
                if (inTheMatrix(rows, curr_row, cols, curr_col))
                    ans[index++] = new int[] { curr_row, curr_col };
                curr_row++;
            }
            timesBot += 2;

            for (int j = 0; j < timesLeft && index < rows * cols; j++) {
                if (inTheMatrix(rows, curr_row, cols, curr_col))
                    ans[index++] = new int[] { curr_row, curr_col };
                curr_col--;
            }
            timesLeft += 2;

            for (int j = 0; j < timesTop && index < rows * cols; j++) {
                if (inTheMatrix(rows, curr_row, cols, curr_col))
                    ans[index++] = new int[] { curr_row, curr_col };
                curr_row--;
            }
            timesTop += 2;
        }
        return ans;
    }

    private boolean inTheMatrix(int rows, int curr_row, int cols, int curr_col) {
        return curr_row >= 0 && curr_row < rows && curr_col >= 0 && curr_col < cols;
    }
}
