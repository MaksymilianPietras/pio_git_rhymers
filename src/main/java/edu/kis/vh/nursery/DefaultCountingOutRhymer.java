package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_NUMBERS = 12;
    public static final int TOTAL_INIT_VAL = -1;
    public static final int TOTAL_DEFAULT_VAL = -1;
    private final int[] numbers = new int[MAX_NUMBERS];

    private int total = TOTAL_INIT_VAL;

    /**
     * @param in Number that you want to add to the array.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return Returns true if array is empty or false if is not.
     */
    public boolean callCheck() {
        return total == TOTAL_DEFAULT_VAL;
    }

    /**
     * @return Returns true if array is full or false if is not.
     */
    public boolean isFull() {
        return total == MAX_NUMBERS-1;
    }

    /**
     * @return Returns -1 if array is empty or last number in the array.
     */
    protected int peekaboo() {
        if (callCheck())
            return TOTAL_DEFAULT_VAL;
        return numbers[total];
    }

    /**
     * @return Returns -1 if array is empty or last number in the array.
     *
     * Function also post decrements total value.
     */
    public int countOut() {
        if (callCheck())
            return TOTAL_DEFAULT_VAL;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

}
