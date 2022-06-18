package javacore.B_exceptions.d_try_with_resources;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        //usando o try com resources, o try se encarregar de fechar o arquivo
        //so pode colocar dentro do parenteses try, classes que implementam closable ou AutoClosable
        //pode colocar quantas classes quiser, separadas por ";".
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }

    //codigo feio
    public static void lerArquivo2(){
        /*Apenas um exemplo de como e feio quando temos usar try/cath em classes
        * que abrem/fecham conexoes com arquivos ou bancos de dados.
        *
        * Sempre que se abrir uma conexao, ela tem que ser fechada no finally
        *
        * O que fica feio, e que o metodo close() tambem gera excpetio e tem que ser
        * tratada no bloco finally (ridiculo mesmo)*/

        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                //ainda tem que testar se e null, pois como o finally sempre e executado
                //se for null da nullPointerException
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
