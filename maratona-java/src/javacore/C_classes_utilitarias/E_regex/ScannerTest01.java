package javacore.C_classes_utilitarias.E_regex;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Goku, Luffy, 700, Naruto, 200, Sasuke, true, 500, Madara, false";
        String[] personagens = text.split(", ");
        for(String p: personagens){
            System.out.println(p);
        }

        System.out.println("\nUsando o Scanner:");

        //ao inves de usar String, vc pode usar Scanner parar pegar valores e passar direto para
        //int ou boolean ou qualquer outro, caso tenha no texto.
        Scanner s = new Scanner(text); //delimitador padrao do Scanner é o espaco, se tiver virgular tem q refazer
        s.useDelimiter(", ");
        while(s.hasNext()){
            if(s.hasNextInt()){
                int i = s.nextInt();
                System.out.println("Int i = "+i);
            }
            else if(s.hasNextBoolean()){
                boolean b = s.nextBoolean();
                System.out.println("Boolean b = "+b);
            }
            else
                System.out.println(s.next());
        }


    }
}
