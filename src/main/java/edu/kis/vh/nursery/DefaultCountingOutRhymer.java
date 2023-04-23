package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_NUMBERS = 12;
    public static final int TOTAL_INIT_VAL = -1;
    public static final int TOTAL_DEFAULT_VAL = -1;
    private final int[] numbers = new int[MAX_NUMBERS];

    private int total = TOTAL_INIT_VAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_DEFAULT_VAL;
    }

    public boolean isFull() {
        return total == MAX_NUMBERS-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL_DEFAULT_VAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL_DEFAULT_VAL;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

}
