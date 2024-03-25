import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] temperatures = new int[] {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result = solution.dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(result));

        temperatures = new int[] {30, 40, 50, 60};

        result = solution.dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(result));

        temperatures = new int[] {30, 60, 90};

        result = solution.dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(result));
    }
}
