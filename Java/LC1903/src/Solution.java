public class Solution {
    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            switch (num.charAt(i)) {
                case '1', '3', '5', '7', '9' -> {
                    return num.substring(0, i + 1);
                }
            }
        }

        return "";
    }
}
