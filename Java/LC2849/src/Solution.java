public class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int dist = Math.max(Math.abs(sx - fx), Math.abs(sy - fy));
        if (dist == 0) {
            if (t == 0) {
                return true;
            }
            return t > 1;
        } else {
            return dist <= t;
        }
    }
}