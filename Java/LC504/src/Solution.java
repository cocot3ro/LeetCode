public class Solution {
    public String convertToBase7(int num) {

        if (num < 7 && num > -7) {
            return String.valueOf(num);
        }

        boolean negativo = num < 0;

        if (negativo) {
            num = -num;
        }

        StringBuilder str = new StringBuilder();

        int cociente = num;
        do {
            str.insert(0, cociente % 7);
        } while ((cociente /= 7) >= 7);

        str.insert(0, cociente);

        return (negativo ? "-" : "") + str;
    }
}
