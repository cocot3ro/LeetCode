public class Lc1684 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        System.out.println(solution.countConsistentStrings(allowed, words));
    }
}
