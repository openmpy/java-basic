package access.ex;

public class MaxCounter {
    private int count;
    private final int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
