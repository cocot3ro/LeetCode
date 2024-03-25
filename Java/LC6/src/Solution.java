public class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            rows[row].append(s.charAt(i));

            if (down) {
                row++;
            } else {
                row--;
            }

            if (row == numRows - 1) {
                down = false;
            } else if (row == 0) {
                down = true;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(rows[i]);
        }

        return result.toString();
    }
}
