import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    private static class Pair<T> {
        private T start;
        private T end;

        public Pair(T start, T end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return start + " -> " + end;
        }
    }

    public String decodeAtIndex2(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length() && ans.length() < k; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                ans.append(c);
            } else {
                ans.append(String.valueOf(ans).repeat((int) c - '1'));
            }
        }
        return String.valueOf(ans.charAt(k - 1));
    }

    public String decodeAtIndex(String s, int k) {
        Map<Pair<Integer>, Character> map = new LinkedHashMap<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length() && start < k; i++) {
            char current = s.charAt(i);
            int lastEnd = -1;
            for (int j = i + 1; j < s.length(); j++) {
                if (isANumber(current)) {
                    for (Map.Entry<Pair<Integer>, Character> entry : map.entrySet()) {
                        Pair<Integer> p = entry.getKey();
                        p.start += (start * (current - '0' - 1));
                        p.end += (end * (current - '0' - 1));
                        lastEnd = p.end;
                    }
                    break;
                }
                char next = s.charAt(j);
                if (current == next) {
                    end++;
                    i++;
                } else {
                    map.put(new Pair<>(start, end), current);
                    break;
                }
            }
            start = (lastEnd == -1 ? end : lastEnd) + 1;
            end = start;
        }

        for (Map.Entry<Pair<Integer>, Character> entry : map.entrySet()) {
            if (k - 1 >= entry.getKey().start && k - 1 <= entry.getKey().end) {
                return entry.getValue().toString();
            }
        }

        return "null";
    }

    private boolean isANumber(char c) {
        return (c >= '0' && c <= '9');
    }
}
