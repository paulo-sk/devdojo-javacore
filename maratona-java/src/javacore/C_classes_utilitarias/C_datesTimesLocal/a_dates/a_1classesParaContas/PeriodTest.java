package javacore.C_classes_utilitarias.C_datesTimesLocal.a_dates.a_1classesParaContas;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        //A classe Period, semelhante a classe Duration, serve para fazer calculo
        //Duration e baseada em horas
        //Period e baseado em dias
        LocalDate now = LocalDate.now();
        LocalDate nowPlus2Y = now.plusYears(2).plusDays(65);
        Period p1 = Period.between(now, nowPlus2Y);
        Period p2 = Period.ofDays(63);
        System.out.println("p1: "+p1);
        //não tem como pegar quantidade de meses apartir somente da quantidade de dias.
        //para pegar a quantidade de meses apenas fornecendo os dias, vc deve utilizar
        //a classe ChronoUnit
        System.out.println("p2: "+p2.getMonths()); //apesar de ter 63 dias, ele retorna 0 meses
        System.out.println("get months: "+p1.getMonths());
        System.out.println("Quantos dias tem 50 semanas: "+Period.ofWeeks(50));
    }
}
