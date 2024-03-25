import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int[] match : matches) {
            hm.put(match[1], hm.getOrDefault(match[1], 0) + 1);
            hm.put(match[0], hm.getOrDefault(match[0], 0));
        }

        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 0) {
                ans.get(0).add(entry.getKey());
            } else if (entry.getValue() == 1) {
                ans.get(1).add(entry.getKey());
            }
        }

        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));

        return ans;
    }
}