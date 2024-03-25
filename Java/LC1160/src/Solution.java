class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;

        for (String word : words) {
            int[] charCount = new int[26];
            boolean isGood = true;

            for (char c : chars.toCharArray()) {
                charCount[c - 'a']++;
            }

            for (char c : word.toCharArray()) {
                if (charCount[c - 'a'] == 0) {
                    isGood = false;
                    break;
                } else {
                    charCount[c - 'a']--;
                }
            }

            if (isGood) {
                ans += word.length();
            }
        }

        return ans;
    }
}