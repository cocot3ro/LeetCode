import java.util.PriorityQueue;

public class SeatManager {
    private PriorityQueue<Integer> list;

    public SeatManager(int n) {
        this.list = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
    }

    public int reserve() {
        return list.remove() + 1;
    }

    public void unreserve(int seatNumber) {
        this.list.add(--seatNumber);
    }
}