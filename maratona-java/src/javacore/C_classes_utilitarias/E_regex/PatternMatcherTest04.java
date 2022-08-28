package javacore.C_classes_utilitarias.E_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Metacaracteres, servem para pegar padrões
 *     \d = pega todos os digitos (numeros)
 *     \D = tudo que não for número
 *     \s = (space), espaços em branco
 *     \S = tudo que nao tem espaço em branco
 *     \w = a-z, A-Z e _ (tod0 o alfabeto, Maiusclo/minusculo e o underline)
 *     \W = tudo que nao for \w (minusculo), basicamente, esse pega numeros e caracteres especiais
 *     [] = range de valores, por exemplo:
 *          [abc], retrona a ou b ou c;
 *          [a-z], retorna todas as letras de a az, minuscula
 *          [a-zA-Z], retonar a-z e A-Z (maiusculoas)
 *
 *      //Para qualcular quantidades de ocorrencias
 *      ? = Zero ou uma
 *      * = Zero ou mais
 *      + = uma ou mais
 *      {n,m} = de n a m ocorrencias
 *      () = agrupamento
 *      | = pipe, para ou, por exemplo: o(v|c)o = vai vir ovo ou oco
 *      $ = fim da linha*/

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        //exercicio: pegue os emails validos*/
       String texto = "luffy@gmail.com, 123jotaro@gmail.com, !#@zoro@gmail.com.br";
       //String regex = "0[xX][\\da-fA-F]+"; só com o + no fim, vai retornar o 0x235, sem o G, e não é valido
       String regex = "([a-z\\d\\._\\s])+@([a-z])+(\\.([a-z])+)+";

       Pattern padraoHexadecimal = Pattern.compile(regex);
       Matcher matcherHexadecimal = padraoHexadecimal.matcher(texto);
       while (matcherHexadecimal.find()){
           System.out.println(matcherHexadecimal.start()+": "+matcherHexadecimal.group());
       }

    }
}
