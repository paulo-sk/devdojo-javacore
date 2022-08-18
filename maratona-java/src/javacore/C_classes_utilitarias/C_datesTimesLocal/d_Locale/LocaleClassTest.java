package javacore.C_classes_utilitarias.C_datesTimesLocal.d_Locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

//a classe Locale serve para formatar datas, moedas e numeros, de acordo com a localidade
//ou preferencia do usuáio
public class LocaleClassTest {
    public static void main(String[] args) {

        //O contrutor recebe até 3 parametros, "language", "country", "variant"
        Locale localJp = new Locale("ja","JP");
        //Vc tambem pode usar variaveis de classe
        //Locale languageFrance = Locale.FRANCH; só muda a linguagem da variavel
        Locale localFrench = Locale.FRANCE; //aqui muda o local e a linguagem

        Calendar c = Calendar.getInstance();

        DateFormat dfJp = DateFormat.getDateInstance(DateFormat.FULL, localJp);
        DateFormat dfFrench = DateFormat.getDateInstance(DateFormat.FULL, localFrench);
        System.out.println("Data Japao: "+dfJp.format(c.getTime()));
        System.out.println("Dysplay country jp: "+localJp.getDisplayCountry());
        System.out.println("Data França: "+dfFrench.format(c.getTime()));
        //O getDysplayCountry so vai mostrar o país, se vc defini-lo no construtor.
        //usando constantes, não vai mostrar.
        System.out.println("Dysplay country franca: "+localFrench.getDisplayCountry());
        System.out.println("Dysplay language franca: "+localFrench.getDisplayLanguage(Locale.JAPAN));
    }
}
