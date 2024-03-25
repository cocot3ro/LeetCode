import java.util.Arrays;

public class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int ans = 0;
        for (int i = 1; i <= piles.length / 3; i++) {
            ans += piles[piles.length - (i * 2)];
        }
        
        return ans;
    }
}