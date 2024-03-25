import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> devices = new ArrayList<>();

        for (String s : bank) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }

            if (count > 0) {
                devices.add(count);
            }
        }

        int beams = 0;
        for (int i = 0; i < devices.size() - 1; i++) {
            beams += devices.get(i) * devices.get(i + 1);
        }

        return beams;
    }
}