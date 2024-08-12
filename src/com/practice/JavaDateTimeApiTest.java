package com.practice;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

public class JavaDateTimeApiTest {
    public static void main(String args[]) {
        LocalDate localDate = LocalDate.now();
        LocalDate endDate = localDate.plus(Period.ofDays(2));
        long dateDiff = ChronoUnit.DAYS.between(localDate,endDate);
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime = localDateTime.with(TemporalAdjusters.firstDayOfYear());
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(dateDiff);
        System.out.println(localDate.isAfter(endDate));

        //second friday of next month
        localDate = localDate.plus(Period.ofMonths(1));
        localDate = localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)).with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(localDate);
    }
}
