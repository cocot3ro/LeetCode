public class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = (length >= 10_000 || width >= 10_000 || height >= 10_000 || ((long) length * width * height) >= 1_000_000_000);
        boolean isHeavy = (mass >= 100);

        if (isBulky && isHeavy) {
            return "Both";
        } else if (isBulky) {
            return "Bulky";
        } else if (isHeavy) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}
