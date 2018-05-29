package com.gft.fpintroduction.dates;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.assertj.core.api.Assertions.assertThat;

class DiscountManagerTest {

    DiscountManager discountManager = new DiscountManager(new HolidayStore());

    @Test
    void testIsDiscounted() {
        assertCorrectlyDiscounted();
    }

    @Disabled
    @Test
    void testIsDiscountedTwice() {
        assertCorrectlyDiscounted();
        assertCorrectlyDiscounted();
    }

    private void assertCorrectlyDiscounted() {
        Calendar purchaseDate = new GregorianCalendar(2018, Calendar.JULY, 3);
        assertThat(discountManager.isDiscounted(purchaseDate)).isTrue();
    }
}