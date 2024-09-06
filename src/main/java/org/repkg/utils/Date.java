package org.repkg.utils;

import java.text.DateFormat;
import java.util.Locale;

public class Date {
    public static String getCurrentDate() {
        Locale loc = new Locale("en", "US");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);
        return dateFormat.format(new java.util.Date());
    }
}
