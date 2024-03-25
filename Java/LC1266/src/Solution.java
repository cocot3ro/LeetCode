public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int seconds = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int[] currentPoint = points[i];
            int[] nextPoint = points[i + 1];

            int xDiff = Math.abs(currentPoint[0] - nextPoint[0]);
            int yDiff = Math.abs(currentPoint[1] - nextPoint[1]);

            seconds += Math.max(xDiff, yDiff);
        }

        return seconds;
    }
}