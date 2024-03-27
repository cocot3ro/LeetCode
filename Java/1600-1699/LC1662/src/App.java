public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(solution.arrayStringsAreEqual(word1, word2));
    }
}
