package javacore.C_classes_utilitarias.C_datesTimesLocal.c_formatacoes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/** Uma coisa a se lembrar: quando vc usar o um DateFormat ou qualquer outra classe/metodo de formatação,
 * vc esta transformando o objeto em string
 * Quando vc usa o parse, vc esta transformando a string em objeto.*/

public class DateTimeFormatterTest01 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        //Passando um LocalDate para String
        String s1 = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = now.format(DateTimeFormatter.ISO_DATE);
        String s3 = now.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //Passando uma String para LocalDate
        //O parse, pega uma String com formatação random e passa para a formatacao padrao do LocalDate
        //que é a forma que deve ser colocada no banco de dados
        LocalDate parse1 = LocalDate.parse(s1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("De Basic ISO date: "+s1+" para > "+parse1);


        //Passando datas baseado em cada local
        //  dd/MM/yyyy -> BR
        //  MM/dd/yyyy -> EU
        //  yyyy/mm/dd -> JP

        //Passando um objeto de LocalDate para a String formatacao do Brasil ("mandando para o front)
        DateTimeFormatter formatBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataBr = LocalDate.now().format(formatBR);
        System.out.println("Data Formatada String Br: "+dataBr);

        //Agora, passando uma string em formato br para objeto de LocalDate para ser salvo no banco(formato padrao)
        LocalDate dataPadrao = LocalDate.parse("10/02/2009", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Data em string br para data padrao: "+dataPadrao);


        //Passando data atual para formatacao JP usando Locale com nome do mes de acordo com o pais
        //Não sei pq mas só funciona usando . e 4M's ali no padrao (para qualquer pais
        DateTimeFormatter formatJP = DateTimeFormatter.ofPattern("yyyy.MMMM.dd", Locale.JAPANESE);
        String dataJP = LocalDate.now().format(formatJP);
        System.out.println(dataJP);

        LocalDate datapadraoJP = LocalDate.parse(dataJP, formatJP);
        System.out.println(datapadraoJP);

    }
}
