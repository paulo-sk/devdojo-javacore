package javacore.C_classes_utilitarias.C_datesTimesLocal.a_dates.a_1classesParaContas;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        /*A única diferenca relevante dessa classe, é que ela mostra o tempo
        //no zulu time, que é o "horario do mundo". Por isso tem um "z" no final do tempo
        //Daí fica facil fazer a conversao de dia e horario de uma zona/regiao para outra
        comparando sempre com o zulu time*/
        System.out.println(now);

    }
}
