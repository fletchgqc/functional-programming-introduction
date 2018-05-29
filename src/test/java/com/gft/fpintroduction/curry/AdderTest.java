package com.gft.fpintroduction.curry;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AdderTest {

    /**
     * Task: Remove the disabled annotation and make the test pass by fixing the function.
     */
    @Test
    @Disabled
    public void testAddOne() {
        Adder adder = new Adder();
        assertThat(adder.add1(3)).isEqualTo(4);
    }

    /**
     * Task: fix the function {@link Adder#curryAdd(int)} so that it curries the add function. This means, when
     * curryAdd(x) is called, it should return a function which adds x to the number passed to it.
     *
     * Fix this test too, so that it asserts that curryAdd works correctly.
     */
    @Test
    public void curryAdd() {
        Adder adder = new Adder();
    }
}