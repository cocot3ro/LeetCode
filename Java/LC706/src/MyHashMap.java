import java.util.Arrays;

public class MyHashMap {
    private final Integer[] values;

    public MyHashMap() {
        this.values = new Integer[1000001];
    }

    public void put(int key, int value) {
        values[key] = value;
    }

    public int get(int key) {
        return (values[key] != null ? values[key] : -1);
    }

    public void remove(int key) {
        if (values.length >= key) {
            values[key] = null;
        }
    }
}