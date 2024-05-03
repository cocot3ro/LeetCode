public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] version1Parts = version1.split("\\.");
        String[] version2Parts = version2.split("\\.");

        int maxLength = Math.max(version1Parts.length, version2Parts.length);

        int[] v1 = new int[maxLength];
        int[] v2 = new int[maxLength];

        for (int i = 0; i < version1Parts.length; i++) {
            v1[i] = Integer.parseInt(version1Parts[i]);
        }

        for (int i = 0; i < version2Parts.length; i++) {
            v2[i] = Integer.parseInt(version2Parts[i]);
        }

        for (int i = 0; i < maxLength; i++) {
            int compare = Integer.compare(v1[i], v2[i]);
            if (compare != 0) return compare;
        }

        return 0;
    }
}