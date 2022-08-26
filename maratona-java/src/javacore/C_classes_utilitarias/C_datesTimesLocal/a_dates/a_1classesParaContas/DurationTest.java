package javacore.C_classes_utilitarias.C_datesTimesLocal.a_dates.a_1classesParaContas;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
    public static void main(String[] args) {
        //A classe duration e boa para fazer calculo entra datas e horas
        //Ela aceita como argumentos: LocalDateTime, LocalTime e Instant
        //Não aceita LocalDate porque não tem nanosegundos
        //Retorna o valor sempre em horas e minutos (e segundos se for colocado)
        //P = period, T = Time

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowPlus2 = now.plusYears(2).plusMinutes(3);
        System.out.println(Duration.between(now, nowPlus2));
        //quantidade de hora de n dias
        System.out.println(Duration.ofDays(72));


    }
}
