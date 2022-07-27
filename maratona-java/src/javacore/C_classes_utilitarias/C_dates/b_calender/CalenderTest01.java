package javacore.C_classes_utilitarias.C_dates.b_calender;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest01 {

    public static void main(String[] args) {
        //classe Calender e abstrata, nao pode ser instanciada.
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            //tem lugar que o primeiro dia da semana e segunda
            System.out.println("Domingo e o primeiro dia da semana nesse local.");
        }

        System.out.println("Dia da semana: "+c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do mes: "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano: "+c.get(Calendar.DAY_OF_YEAR));
    }
}
