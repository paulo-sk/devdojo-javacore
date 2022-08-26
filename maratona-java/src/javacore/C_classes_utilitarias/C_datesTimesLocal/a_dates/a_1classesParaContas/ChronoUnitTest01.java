package javacore.C_classes_utilitarias.C_datesTimesLocal.a_dates.a_1classesParaContas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ChronoUnitTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate birtDay = LocalDate.of(2000,3,28);
        LocalDate birtDay2 = LocalDate.of(1995,3,28);
        System.out.println(ChronoUnit.DAYS.between(birtDay, now));
        System.out.println(ChronoUnit.DAYS.between(birtDay2, birtDay));
        System.out.println(ChronoUnit.YEARS.between(birtDay, now));
        //System.out.println(ChronoUnit.HOURS.between(birtDay, now)); com horas nao funciona
        //para horas tem que usar o duration
        System.out.println(Duration.ofDays(1827));

    }
}
