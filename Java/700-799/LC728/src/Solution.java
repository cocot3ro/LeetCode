import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new LinkedList<>();

        for (int i = left; i <= right; i++) {
            if (selfDividingNumber(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    private boolean selfDividingNumber(int num) {
        String numAsString = String.valueOf(num);

        if (numAsString.contains("0")) {
            return false;
        }

        for (int i = 0; i < numAsString.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(numAsString.charAt(i)));
            if (num % digit != 0) {
                return false;
            }
        }

        return true;
    }
}
