package javacore.C_classes_utilitarias.C_datesTimesLocal.c_formatacoes;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale def = Locale.getDefault();
        Locale localJP = Locale.JAPAN;
        Locale localUK = Locale.UK;

        //formatacao da moeda, qual o simbolo
        NumberFormat[] nf = new NumberFormat[3];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(localJP);
        nf[2] = NumberFormat.getCurrencyInstance(localUK);

        double number = 10_000.345;
        for(NumberFormat nftemp: nf){
            nftemp.setMaximumFractionDigits(6);
            System.out.println(nftemp.format(number));
        }
    }
}
