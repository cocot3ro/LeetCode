public class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        int n = words.length;

        for (String word : words) {
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
        }

        for (int i : count) {
            if (i % n != 0) {
                return false;
            }
        }

        return true;
    }
}