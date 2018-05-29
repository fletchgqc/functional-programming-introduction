package com.gft.fpintroduction.dates;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class Java8DiscountManagerTest {

    Java8DiscountManager discountManager = new Java8DiscountManager(new Java8HolidayStore());

    @Test
    void testIsDiscounted() {
        assertCorrectlyDiscounted();
    }

    @Test
    void testIsDiscountedTwice() {
        assertCorrectlyDiscounted();
        assertCorrectlyDiscounted();
    }

    private void assertCorrectlyDiscounted() {
        LocalDate purchaseDate = LocalDate.of(2018, 7, 3);
        assertThat(discountManager.isDiscounted(purchaseDate)).isTrue();
    }
}