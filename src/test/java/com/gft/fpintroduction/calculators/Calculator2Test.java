package com.gft.fpintroduction.calculators;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Calculator2Test {

    @Test
    public void add3ShouldSumPositiveNumbers() {
        Calculator2 calculator2 = new Calculator2();

        assertThat(calculator2.add3(1, 2, 4)).isEqualTo(7);
    }

    @Test
    public void add3ShouldSumNegativeNumbers() {
        Calculator2 calculator2 = new Calculator2();

        assertThat(calculator2.add3(1, 2, -4)).isEqualTo(-1);
    }
}
