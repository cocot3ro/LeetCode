public class Solution {
    public String maskPII(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        if (s.contains("@")) {
            sb.append(s.charAt(0));
            int index = s.indexOf("@");
            sb.append("*".repeat(5));
            sb.append(s.substring(index - 1));
        } else {
            s = s.replace("+", "").replace("-", "").replace("(", "").replace(")", "").replace(" ", "");
            switch (s.length()) {
                case 10 -> sb.append("***-***-").append(s, 6, 10);
                case 11, 12, 13 -> {
                    sb.append("***-***-").append(s, s.length() - 4, s.length());
                    sb.insert(0, "-");
                    sb.insert(0, "*".repeat(s.length() - 10));
                    sb.insert(0, "+");
                }
            }
        }
        return sb.toString();
    }
}
