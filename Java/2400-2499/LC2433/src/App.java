import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] pref = {5, 2, 0, 3, 1};

        System.out.println(Arrays.toString(solution.findArray(pref)));
    }
}
