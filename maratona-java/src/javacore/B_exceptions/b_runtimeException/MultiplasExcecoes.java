package javacore.B_exceptions.b_runtimeException;

public class MultiplasExcecoes {
    public static void main(String[] args) {
        //podemos tratar multiplas excecoes
        /*
        * Sempre coloque primeiro, as exceptions mais especificas para as mais genericas
        * se vc por exemplo, colocar "RuntimeExcetion pra ser tratada primeiro
        * os outros catch com exceptions mais especificas nao vao funcionar, vai dar
        * erro dizendo que tal excpetion (especifica) ja foi tratada (RuntimeException trata tudo*/
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do catch de ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do catch de IndexOutOfBoundsExcecption");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do catch de IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do catch de AritimeticException");
        }
    }
}
