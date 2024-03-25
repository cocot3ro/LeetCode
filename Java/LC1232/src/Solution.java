public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        int jumpX = coordinates[1][0] - coordinates[0][0];
        int jumpY = coordinates[1][1] - coordinates[0][1];

        for (int i = 1; i < coordinates.length; i++) {
            int x = coordinates[i][0] - coordinates[i - 1][0];
            int y = coordinates[i][1] - coordinates[i - 1][1];

            if (x * jumpY != y * jumpX)
                return false;
        }

        return true;
    }
}
