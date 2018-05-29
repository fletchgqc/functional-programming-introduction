package com.gft.fpintroduction.calculators;

/**
 * Calculator class.
 * <p>
 * Task: Imagine you come across this class whilst making changes to a real production system. What changes would you
 * make to this class to improve it? Do them now. Assume that the class is being used by other classes in the system (i
 * .e. don't change the public API).
 * <p>
 * Don't change the tests. When you are finished, the tests must still pass.
 */
public class Calculator2 {

    /**
     * Returns the sum of a, b and c
     */
    public int add3(int a, int b, int c) {
        return add(add(a, b), c);
    }

    /**
     * Returns the result of adding a and b together
     */
    private int add(int a, int b) {
        System.out.println("Adding " + a + " and " + b);
        int result = a;

        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result++;
                System.out.println("i is now " + i + ", result currently " + result);
            }
        } else {
            for (int i = 0; i > b; i--) {
                result--;
                System.out.println("i is now " + i + ", result currently " + result);
            }
        }
        return result;
    }
}
