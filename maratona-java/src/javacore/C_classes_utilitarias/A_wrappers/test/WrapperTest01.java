package javacore.C_classes_utilitarias.A_wrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10;
        char charP = 'F';
        boolean booleanP = false;

        //classes wrappers, sao apenas tipos primitivos como classes,que tem alguns metodos uteis.
        /*Para usar wrapper, é so usar o nome dos tipos primitivos comelando com letra maiuscula
         * com excecao do int e do int e do char (sao Integer e Charcarter*/

        //tambem e necessario para usar com collections; List<Integer> por exemplo.

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10.0;
        Character charW = '3';
        Boolean booleanW = false;

        System.out.println(Character.isDigit(charW)); //Character tem alguns metodos interessantes
    }

}
