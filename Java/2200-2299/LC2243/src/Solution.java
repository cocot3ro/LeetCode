class Solution {
    public String digitSum(String s, int k) {
        if (s.length() <= k) {
            return s;
        }

        int n = s.length();
        String[] arr = new String[(int) Math.ceil((double) n / k)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.substring(i * k, Math.min((i + 1) * k, n));
            int sum = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                sum += Character.getNumericValue(arr[i].charAt(j));
            }
            arr[i] = Integer.toString(sum);
        }

        return digitSum(String.join("", arr), k);
    }
}