import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public String removeDuplicateLetters(String s) {
        Set<Character> tree = new TreeSet<>();
        for(Character c : s.toCharArray()) {
            tree.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : tree) {
            sb.append(c);
        }

        return sb.toString();
    }
}
