package com.gft.fpintroduction.dates;

import java.util.Calendar;

/**
 * Decides whether to offer discounts for purchases
 */
public class DiscountManager {

    private HolidayStore holidayStore;

    public DiscountManager(HolidayStore holidayStore) {
        this.holidayStore = holidayStore;
    }

    /**
     * @return whether a purchase made on this day should be discounted
     */
    public boolean isDiscounted(Calendar purchaseDate) {
        // discounts are offered exclusively in the first week of the summer holidays

        if (purchaseDate.before(holidayStore.getStartSummerHolidays2018())) {
            return false;
        }

        Calendar endSummerHolidays = holidayStore.getStartSummerHolidays2018();
        endSummerHolidays.add(Calendar.DATE, 7);

        if (purchaseDate.after(endSummerHolidays)) {
            return false;
        }

        return true;
    }
}
