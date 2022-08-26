package javacore.C_classes_utilitarias.C_datesTimesLocal.a_dates;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LoclaDateTimeTest01 {
    public static void main(String[] args) {
        //A classe LocalDateTime é basicamente uma juncao de LocalDate e LocalTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        //vc pode usar as 3 classes em conjunto, usando parse string tambem
        LocalDate dateTest = LocalDate.parse("2023-02-13");
        LocalTime timeTest = LocalTime.parse("15:04:03");
        LocalDateTime dateTime2 = dateTest.atTime(timeTest); //ou tambem o contrario
        System.out.println(dateTime2);
        LocalDateTime dateTime3 = timeTest.atDate(dateTest);
        System.out.println(dateTime3);

        //supondo que eu queria só a data de uma variavel de DateTime e passar para um LocalDate
        DateTimeFormatter strDate = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        System.out.println(strDate.format(dateTime2));

        //vc poderia tambem, não usar strDate, pois DateTimeFormatter é abstrata, vc pode usar direto
        System.out.println(DateTimeFormatter.ofPattern("yyy-mm-dd").format(dateTime));
    }
}
