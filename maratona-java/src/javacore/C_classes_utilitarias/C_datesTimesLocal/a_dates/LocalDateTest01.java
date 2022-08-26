package javacore.C_classes_utilitarias.C_datesTimesLocal.a_dates;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Locale;

public class LocalDateTest01 {
    public static void main(String[] args) {
        //local date não é abstrata, mas tambem nao pode se usar o new
        //implementada no java 8, é a classe que deve ser utilizada ao inves de Date ou Calendar

        LocalDate dateTest = LocalDate.of(2022, Month.JULY,23);
        /*LocalDate é uma classe imutavel, entao vc nao pode mudar valores de atributos de um objeto
        * diretamente. Vc tem usar uma nova variavel de referencia, que vai apontar para um novo
        * objeto criado na mudança. Por exemplo: se vc colocar só isso aqui:
        * dataTest.plusDays(3), não vai funcionar, pois vai criar um novo objeto, mas não tem
        * variavel apontando para ele. O objeto que dateTest está apontando é imutavel
        * Para usar essa mudança vc tem que redeclacrar, como no exemplo abaixo.*/
        dateTest = dateTest.plusDays(3);

        System.out.println(dateTest); //aparece como no banco de dados

        System.out.println(dateTest.isLeapYear());
        System.out.println(dateTest.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
    }
}
