import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int countHomogenous(String s) {
        long ans = 0;

        for (String str : split(s)) {
            ans += sum(str.length());
        }

        return (int) (ans % 1000000007);
    }

    private String[] split(String s) {
        List<String> substrings = new ArrayList<>();
        char currentChar = s.charAt(0);
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            char nextChar = s.charAt(i);

            if (nextChar == currentChar) {
                count++;
            } else {
                substrings.add(currentChar + new String(new char[count]).replace('\0', currentChar));
                currentChar = nextChar;
                count = 0;
            }
        }

        substrings.add(currentChar + new String(new char[count]).replace('\0', currentChar));

        return substrings.toArray(new String[0]);
    }

    private long sum(int n) {
        long sum = n;
        for (long i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
