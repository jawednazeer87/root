package org.la.core.java.student.jdbc.util;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class DateUtil {

    public static int findAgeByDOB(Calendar calendar){
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        LocalDate l1 = LocalDate.of(year, month, date);
        LocalDate now1 = LocalDate.now();
        Period diff1 = Period.between(l1, now1);
        int years = diff1.getYears();
        System.out.println("age: " + years + " years");
        return years;
    }
}
