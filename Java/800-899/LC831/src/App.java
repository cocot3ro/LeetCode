public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "LeetCode@LeetCode.com";

        System.out.println(solution.maskPII(s));

        s = "1(234)567-890";

        System.out.println(solution.maskPII(s));
    }
}
