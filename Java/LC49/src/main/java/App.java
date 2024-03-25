public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };

        System.out.println(solution.groupAnagrams(strs));
    }
}
