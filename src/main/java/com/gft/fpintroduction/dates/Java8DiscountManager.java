package com.gft.fpintroduction.dates;

import java.time.LocalDate;

/**
 * Decides whether to offer discounts for purchases
 */
public class Java8DiscountManager {

    private Java8HolidayStore holidayStore;

    public Java8DiscountManager(Java8HolidayStore holidayStore) {
        this.holidayStore = holidayStore;
    }

    /**
     * @return whether a purchase made on this day should be discounted
     */
    public boolean isDiscounted(LocalDate purchaseDate) {
        // discounts are offered exclusively in the first week of the summer holidays

        LocalDate startSummerHolidays = holidayStore.getStartSummerHolidays2018();

        if (purchaseDate.isBefore(startSummerHolidays)) {
            return false;
        }

        LocalDate endSummerHolidays = startSummerHolidays.plusDays(7);

        if (purchaseDate.isAfter(endSummerHolidays)) {
            return false;
        }

        return true;
    }
}
