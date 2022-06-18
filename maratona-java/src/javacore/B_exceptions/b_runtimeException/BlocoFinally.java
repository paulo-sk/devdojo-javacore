package javacore.B_exceptions.b_runtimeException;

import java.io.File;
import java.io.IOException;

public class BlocoFinally {
    public static void main(String[] args) {
        abrindoConexao();
    }

    public static void abrindoConexao(){
        /*quando por exemplo vc usa um recurso para acessar o bancod e dados,
          esse recurso deve ser fechado, independente do que aconteça nos blocos try e catch

          O BLOCO FINALLY SEMPRE SERA EXECUTADO.
         */
        try {
            System.out.println("Abrindo conexao com banco de dados");
            System.out.println("Escrevendo");
            throw new RuntimeException("Erro ao fazer o registro");

        } catch (RuntimeException e) {
            e.printStackTrace(); //printa no console tudo que aconteceu.
        }finally {
            System.out.println("Fechando conexao com o banco;");
        }
    }
}
