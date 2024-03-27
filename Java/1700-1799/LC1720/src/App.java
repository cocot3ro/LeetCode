import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] encoded = {1, 2, 3};
        int first = 1;

        System.out.println(Arrays.toString(solution.decode(encoded, first)));
    }
}
