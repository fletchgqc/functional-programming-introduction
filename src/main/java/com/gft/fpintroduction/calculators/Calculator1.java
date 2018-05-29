package com.gft.fpintroduction.calculators;

/**
 * Calculator class.
 * <p>
 * Task: Imagine you come across this class whilst making changes to a real production system. What changes would you
 * make to this class to improve it? Do them now. Assume that the class is being used by other classes in the system (i
 * .e. don't change the public API).
 * <p>
 * Don't change the tests. When you are finished, the tests must still pass.
 * <p>
 * Expected time required to complete task: 5 minutes.
 */
public class Calculator1 {

    /**
     * Returns the largest number of a, b and c
     */
    public int max3(int a, int b, int c) {
        return max(max(a, b), c);
    }

    /**
     * Returns whichever is largest out of a and b
     */
    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
