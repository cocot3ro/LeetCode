import java.util.List;

public class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }

        int i = 0;
        for (String word : words) {
            if (word.charAt(0) != s.charAt(i++)) {
                return false;
            }
        }

        return true;
    }
}
