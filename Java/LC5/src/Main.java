public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s;

        s = "babad";
        System.out.println("res: " + solution.longestPalindrome(s));

        s = "cbbd";
        System.out.println("res: " + solution.longestPalindrome(s));

        s = "abb";
        System.out.println("res: " + solution.longestPalindrome(s));
    }
}