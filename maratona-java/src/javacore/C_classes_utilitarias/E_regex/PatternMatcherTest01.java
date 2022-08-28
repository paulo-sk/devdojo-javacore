package javacore.C_classes_utilitarias.E_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Regular expressions: Aqui no java, o matcher nao conta padroes repetidos
 * Por exemplo, se vc colocar pra buscar pelo padrao "aba" em um texto "abababa"
 * ele só vai achar na posicao 0 (0,1,2) e, excluindo essas posicoes, vai procurar novamente
 * e achar na posicao 4(4,5,6). Ele não conta com com padrao encontrado a partido do segundo a*/

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String texto = "abababababa";
        String regex = "aba";

        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);
        System.out.println("Posicoes onde o padrao '"+regex+"' foi encontrado no texto: '"+texto+"'.");
        while(matcher.find()){
            System.out.print(matcher.start()+" ");
        }

    }
}
