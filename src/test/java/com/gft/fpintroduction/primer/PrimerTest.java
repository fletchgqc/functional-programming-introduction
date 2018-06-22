package com.gft.fpintroduction.primer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimerTest {

    @Test
    public void testPrimer() {
        Primer primer = new Primer();
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertThat(primer.getPrimes(numbers)).containsExactly(2, 3, 5, 7);
    }


}
