public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] ans = new int[img.length][img[0].length];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                int count = 0;
                int sum = 0;
                for (int k = Math.max(0, i - 1); k < Math.min(ans.length, i + 2); k++) {
                    for (int l = Math.max(0, j - 1); l < (Math.min(ans[0].length, j + 2)); l++) {
                        count++;
                        sum += img[k][l];
                    }
                }
                ans[i][j] = sum / count;
            }
        }

        return ans;
    }
}