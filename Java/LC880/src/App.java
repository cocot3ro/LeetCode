public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s, expected, result1, result2;
        int k;

        s = "leet2code3";
        k = 10;
        expected = "o";
        result1 = solution.decodeAtIndex2(s, k);
        result2 = solution.decodeAtIndex(s, k);
        System.out.println(">>>>>>>>> " + result1 + ": " + result1.equals(expected) + ", " + result2 + ": " + result2.equals(expected));

        s = "leet3code3";
        k = 14;
        expected = "o";
        result1 = solution.decodeAtIndex2(s, k);
        result2 = solution.decodeAtIndex(s, k);
        System.out.println(">>>>>>>>> " + result1 + ": " + result1.equals(expected) + ", " + result2 + ": " + result2.equals(expected));

        s = "ha22";
        k = 5;
        expected = "h";
        result1 = solution.decodeAtIndex2(s, k);
        result2 = solution.decodeAtIndex(s, k);
        System.out.println(">>>>>>>>> " + result1 + ": " + result1.equals(expected) + ", " + result2 + ": " + result2.equals(expected));

        s = "a2345678999999999999999";
        k = 1;
        expected = "a";
        result1 = solution.decodeAtIndex2(s, k);
        result2 = solution.decodeAtIndex(s, k);
        System.out.println(">>>>>>>>> " + result1 + ": " + result1.equals(expected) + ", " + result2 + ": " + result2.equals(expected));

        s = "y959q969u3hb22odq595";
        k = 222_280_369;
        expected = "y";
        result1 = solution.decodeAtIndex2(s, k);
        result2 = solution.decodeAtIndex(s, k);
        System.out.println(">>>>>>>>> " + result1 + ": " + result1.equals(expected) + ", " + result2 + ": " + result2.equals(expected));
    }
}
