package com.practice;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class JavaInstantCheck {
    public static void main(String args[])
    {
        String zone = "Asia/Dubai";
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zone)).with(LocalTime.MIN);
        LocalDateTime startTime = LocalDateTime.now().with(LocalTime.MIN);
        LocalDateTime endTime = LocalDateTime.now().with(LocalTime.MAX);
        startTime = startTime.minusWeeks(1).with(ChronoField.DAY_OF_WEEK,1);
        endTime = endTime.minusWeeks(1).with(ChronoField.DAY_OF_WEEK,7);
        zonedDateTime = zonedDateTime.with(ChronoField.DAY_OF_WEEK,1);
        System.out.println(zonedDateTime);
        System.out.println(startTime.toInstant(ZoneOffset.UTC));
        System.out.println(endTime.toInstant(ZoneOffset.UTC));
    }
}
