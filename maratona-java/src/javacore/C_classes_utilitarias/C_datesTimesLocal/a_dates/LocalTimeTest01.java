package javacore.C_classes_utilitarias.C_datesTimesLocal.a_dates;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.of(17,25,34);
        LocalTime agora = LocalTime.now();
        System.out.println(hora);
        System.out.println("Agora: "+agora);
        System.out.println(hora.getMinute());
        System.out.println(hora.getSecond());
        System.out.println("midnight: "+LocalTime.MIDNIGHT);
        System.out.println("minimo do dia:"+LocalTime.MIN);
        System.out.println("maximo do dia: "+LocalTime.MAX);
    }
}
