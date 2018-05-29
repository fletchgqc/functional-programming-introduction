package com.gft.fpintroduction.dates;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Stores holidays known to the system
 */
public class HolidayStore {

    private Calendar startSummerHolidays2018 = new GregorianCalendar(2018, Calendar.JULY, 2);

    public Calendar getStartSummerHolidays2018() {
        return startSummerHolidays2018;
    }
}
