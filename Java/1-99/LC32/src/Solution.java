import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        for (int i = s.length(); i >= 0; i--) {
            for (int j = 0; j < s.length() && j != i; j++) {
                String substring = s.substring(j, i);
                if (isValid(substring)) {
                    max = Math.max(max, substring.length());
                }
            }
        }

        return max;
    }

    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' -> stack.add(s.charAt(i));
                case ')' -> {
                    if (stack.isEmpty() || stack.peek() != '(')
                        return false;
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}