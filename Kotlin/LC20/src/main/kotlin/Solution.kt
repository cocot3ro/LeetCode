class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (i in s.indices) {
            when (s[i]) {
                '(' -> stack.add(s[i])
                ')' -> {
                    if (stack.lastOrNull() == '(') {
                        stack.removeLast()
                    } else {
                        return false
                    }
                }
                '{' -> stack.add(s[i])
                '}' -> {
                    if (stack.lastOrNull() == '{') {
                        stack.removeLast()
                    } else {
                        return false
                    }
                }
                '[' -> stack.add(s[i])
                ']' -> {
                    if (stack.lastOrNull() == '[') {
                        stack.removeLast()
                    } else {
                        return false
                    }
                }
            }
        }

        return stack.isEmpty()
    }
}
