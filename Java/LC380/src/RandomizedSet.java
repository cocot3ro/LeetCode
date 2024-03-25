import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizedSet {

    private List<Integer> set;

    public RandomizedSet() {
        set = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (set.contains((Integer) val)) {
            return false;
        }

        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove((Integer) val);
    }

    public int getRandom() {
        return set.get(new Random().nextInt(set.size()));
    }
}