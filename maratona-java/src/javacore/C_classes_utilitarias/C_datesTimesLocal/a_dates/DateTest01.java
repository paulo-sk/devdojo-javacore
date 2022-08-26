package javacore.C_classes_utilitarias.C_datesTimesLocal.a_dates;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        //apenas por questoes de estudos. Ainda existe sistema legado que sua a classe Date
        //Essa classe esta depreciada, evite usa-la.

        //date trabalha com milisegundos com long começando a partir de 1970
        Date date = new Date(1_000_000_000_000L);
        System.out.println(date);

        //o ruim da classe date e que ela nao permite internacionalizacao, e tambem pq usa milisegundos
        //por exemplo, para adicionar 1h
        date.setTime(date.getTime() + 3_600_000); //3milhoes e 600 milesegundos para representar 1h, ridiculo
        System.out.println(date);
    }
}
