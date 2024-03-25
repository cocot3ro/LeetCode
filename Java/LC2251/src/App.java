import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] flowers = {{1,6},{3,7},{9,12},{4,13}};
        int[] people = {2, 3, 7, 11};

        System.out.println(Arrays.toString(solution.fullBloomFlowers(flowers, people)));
    }
}
