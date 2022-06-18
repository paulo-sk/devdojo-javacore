package javacore.B_exceptions.c_checkedExceptions.file_exemple;

import java.io.File;
import java.io.IOException;

public class IOExceptionExemple {
    public static void main(String[] args) {
            createFile();
    }

    public static void createFile(){
        File file = new File("arquivo/file.txt"); //cria o arquivo nesse path

        try {
            //como esse metodo lanca uma excecao IOException, deve ser obrigatoriamente tratado com try/catch.
            //sempre trate a excecao mais especifica.
            boolean isCreated = file.createNewFile();

            //caso tenha erro na criacao do arquivo (linha 17), nada abaixo sera executado.
            System.out.println("File created: "+isCreated);
        } catch (IOException e) {
            //NUNCA DEIXE O BLOCO CATCH EM BRANCO. DE NOVO, NUNCA DEIXE O BLOCO CATCH EM BRANCO.

            /*se usar esse primeiro metodo abaixo, ele joga o erro para o metodo que o chamou (main)
            * para tratar o erro. Mas esse exemplo, estou tratando no proprio metodo com o
            * printstackTrace()
            */
           // throw new RuntimeException(e);

            e.printStackTrace(); //printa no console tudo que aconteceu.
        }
    }
}
