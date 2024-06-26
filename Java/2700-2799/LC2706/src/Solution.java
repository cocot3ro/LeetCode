import java.util.Arrays;

public class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        return (prices[0] + prices[1] <= money ? money - (prices[0] + prices[1]) : money);
    }
}