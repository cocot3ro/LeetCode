import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            StringBuilder toAdd = new StringBuilder();
            if (i % 3 == 0) {
                toAdd.append("Fizz");
            }

            if (i % 5 == 0) {
                toAdd.append("Buzz");
            }

            if (toAdd.isEmpty()) {
                toAdd.append(i);
            }

            ans.add(toAdd.toString());
        }

        return ans;
    }
}
