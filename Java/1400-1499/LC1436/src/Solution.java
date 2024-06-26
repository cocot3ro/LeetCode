import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();

        for (List<String> path : paths) {
            cities.add(path.get(0));
            cities.add(path.get(1));
        }

        for (List<String> path : paths) {
            cities.remove(path.get(0));
        }

        return cities.iterator().next();
    }
}