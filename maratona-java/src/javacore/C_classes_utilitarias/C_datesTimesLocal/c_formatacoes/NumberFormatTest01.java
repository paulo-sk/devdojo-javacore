package javacore.C_classes_utilitarias.C_datesTimesLocal.c_formatacoes;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale def = Locale.getDefault();
        Locale localJP = Locale.JAPAN;
        Locale localUK = Locale.UK;

        //formatacao de numeros (onde/quando tempo ponto ou virgula)
        NumberFormat[] nf = new NumberFormat[3];
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(localJP);
        nf[2] = NumberFormat.getInstance(localUK);

        double number = 10_000.345;
        for(NumberFormat nftemp: nf){
            System.out.println(nftemp.format(number));
        }

    }
}
