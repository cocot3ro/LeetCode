public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';

        System.out.println(solution.nextGreatestLetter(letters, target));
    }
}
