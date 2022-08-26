package javacore.C_classes_utilitarias.C_datesTimesLocal.a_dates.a_1classesParaContas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TimeAdjusterTest {
    public static void main(String[] args) {
        LocalDate now  = LocalDate.now();
        //now = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);

        if(     now.getDayOfWeek() == DayOfWeek.THURSDAY ||
                now.getDayOfWeek() == DayOfWeek.FRIDAY ||
                now.getDayOfWeek() == DayOfWeek.SATURDAY ||
                now.getDayOfWeek() == DayOfWeek.SUNDAY
        ) now = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        else
            now = now.plusDays(1);
        System.out.println(now);
    }
}
