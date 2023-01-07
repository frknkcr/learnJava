package ders26_immutableClasses;

import java.time.LocalDate;

public class C05_LocalDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date); // 2022-12-25

        System.out.println(date.getDayOfWeek()); // SUNDAY
        System.out.println(date.getMonthValue()); // 12
        System.out.println(date.getMonth()); // DECEMBER
        System.out.println(date.getDayOfYear()); // 359

        System.out.println(date.withYear(2015)); // 2015-12-25
        System.out.println(date.withDayOfMonth(15)); // 2022-12-15
        System.out.println(date.withDayOfMonth(15).withYear(2015)); // 2015-12-15

        System.out.println(date.isLeapYear()); // false

        System.out.println(date.minusWeeks(5)); // 2022-11-20
        System.out.println(date.minusYears(3).minusMonths(5).minusDays(5)); // 2019-07-20

        System.out.println(date.plusWeeks(19)); // 2023-05-07
        System.out.println(date.plusYears(10).plusMonths(3).plusWeeks(10)); // 2033-06-03

        LocalDate date1 = LocalDate.of(1975,10,13);
        LocalDate date2 = LocalDate.of(1975,10,20);
        System.out.println(date1.isBefore(date2)? "Date1 daha eski" : "Date2 daha eski");

        System.out.println(date1.isLeapYear()); // false

        System.out.println(date.hashCode()); // 4141849
        System.out.println(date1.hashCode()); // 4045453
        System.out.println(date2.minusDays(7).hashCode()); // 4045453
    }
}
