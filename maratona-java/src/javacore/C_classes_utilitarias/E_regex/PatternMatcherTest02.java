package javacore.C_classes_utilitarias.E_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Metacaracteres, servem para pegar padrões
 *     \d = pega todos os digitos (numeros)
 *     \D = tudo que não for número
 *     \s = (space), espaços em branco
 *     \S = tudo que nao tem espaço em branco
 *     \w = a-z, A-Z e _ (todo o alfabeto, Maiusclo/minusculo e o underline)
 *     \W = tudo que nao for \w (minusculo), basicamente, esse pega numeros e caracteres especiais*/

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        String texto = "ab2 ba\tba#";
        String regex = "\\W";

        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);
        System.out.println("Posicoes onde o padrao '"+regex+"' foi encontrado no texto: '"+texto+"'.");
        System.out.println("P : V"); //posicao : valor
        while(matcher.find()){
            System.out.println(matcher.start()+" : '"+matcher.group()+"'");
        }

    }
}
