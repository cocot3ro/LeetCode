public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "III";
        System.out.println(s + ": " + solution.romanToInt(s));

        s = "LVIII";
        System.out.println(s + ": " + solution.romanToInt(s));

        s = "MCMXCIV";
        System.out.println(s + ": " + solution.romanToInt(s));

        s = "MMMDCCCLXXXVIII";
        System.out.println(s + ": " + solution.romanToInt(s));
    }
}
