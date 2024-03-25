public class MyHashSet {
    private final Integer[] values;

    public MyHashSet() {
        values = new Integer[1000001];
    }

    public void add(int key) {
        values[key] = key;
    }

    public void remove(int key) {
        values[key] = null;
    }

    public boolean contains(int key) {
        return values[key] != null;
    }
}