public class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);

        return countVowels(a) == countVowels(b);
    }

    private int countVowels(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }

        return count;
    }
}