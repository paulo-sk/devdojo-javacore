package javacore.C_classes_utilitarias.C_datesTimesLocal.c_dateformat;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        /*O DateFormat é uma classe abstrata, cada metodo dessa classe,
        * formata uma data de forma diferente. Para usar, vc deve usar as 3 partes
        * da formatacao de data, que sao a classe, o metodo
        * e a funcao format("que recebe uma data, pode ser do calendar ou Date")
        * Exemplo: DateFormat.getInstance().format(calendar.getTime())
        * que pega a data atual e formata de acordo com o sistema operacional em uso.
        * Lembrando que a data formatada, retorna uma string e não um data.*/
        String d = DateFormat.getInstance().format(calendar.getTime());
        System.out.println("Exemplo de data, atrbuido a uma string, dps de formatada: "+d);

        /*para exemplo, vou utilizar um array e declararar para cada posicao
        * O DateFormat.metodo. Na hora de imprimir, usarei apenas o metodo format*/
        //7 tipos principais de formataçoes da classe DateFormat (abstrata)
        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        System.out.println("\nMostrando formas do DateFormat no array:");
        for(DateFormat tempDate: df){
            System.out.println(tempDate.format(calendar.getTime()));
        }

    }
}
