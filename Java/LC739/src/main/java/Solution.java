public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int hottest = 0;

        for (int currDay = temperatures.length - 1; currDay >= 0; currDay--) {

            int currentTemp = temperatures[currDay];

            if (currentTemp >= hottest) {
                hottest = currentTemp;
                continue;
            }

            int days = 1;
            while (temperatures[currDay + days] <= currentTemp) {
                days += result[currDay + days];
            }

            result[currDay] = days;
        }

        return result;
    }
}