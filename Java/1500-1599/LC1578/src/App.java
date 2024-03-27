public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String colors = "ababa";
        int[] neededTime = { 10, 5, 10, 5, 10 };

        System.out.println(solution.minCost(colors, neededTime));
    }
}
