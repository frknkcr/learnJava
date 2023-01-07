package ders27_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Turkey"));

        System.out.println(ldt); // 2022-12-20T12:29:24.112139400

        ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println(ldt.getDayOfWeek());

        System.out.println(ldt.withYear(2030));

    }
}
