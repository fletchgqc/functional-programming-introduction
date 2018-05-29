package com.gft.fpintroduction.calculators;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Calculator1Test {

    @Test
    public void max3ShouldReturnMaxOfThreePositveNumbers() {
        Calculator1 calculator1 = new Calculator1();

        assertThat(calculator1.max3(1, 18, 4)).isEqualTo(18);
    }

    @Test
    public void add3ShouldReturnMaxOfPositiveAndNegativeNumbers() {
        Calculator1 calculator1 = new Calculator1();

        assertThat(calculator1.max3(1, 2, -4)).isEqualTo(2);
    }
}
