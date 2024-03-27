public class Solution {
    public boolean winnerOfGame(String colors) {
        int contA = 0;
        int lastA = -1;
        while ((lastA = colors.indexOf("AAA", lastA + 1)) > -1) {
            contA++;
        }

        int contB = 0;
        int lastB = -1;
        while ((lastB = colors.indexOf("BBB", lastB + 1)) > -1) {
            contB++;
        }

        return contA > contB;
    }
}
