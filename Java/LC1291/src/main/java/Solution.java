import java.util.*;

public class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        Set<Integer> result = new TreeSet<>();

        String digits = "123456789";
        String ones = "111111111";

        for (int i = String.valueOf(low).length(); i < String.valueOf(high).length() + 1; i++) {
            int n = low / (int) Math.pow(10, i - 1);
            if (n < 1) {
                n = 1;
            }
            int number = Integer.parseInt(digits.substring(n - 1, Math.min(n - 1 + i, digits.length())));
            if (String.valueOf(number).length() < i) {
                continue;
            }

            if (number >= low && number <= high) {
                result.add(number);
            }

            for (int j = 10 - i - n; j > 0; j--) {
                number += Integer.parseInt(ones.substring(0, i));
                if (number <= high) {
                    result.add(number);
                } else {
                    break;
                }
            }
        }

        return new LinkedList<>(result);
    }
}