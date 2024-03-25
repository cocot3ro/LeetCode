import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        char[] s = { 'H', 'e', 'l', 'l', 'o' };

        solution.reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}
