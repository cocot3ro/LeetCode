public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "w".repeat(100000);

        System.out.println(solution.countHomogenous(s));
    }
}
