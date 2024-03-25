public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println(solution.strStr(haystack, needle));
    }
}
