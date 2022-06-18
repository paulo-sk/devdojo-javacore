package javacore.B_exceptions.b_runtimeException;

public class Test02 {
    public static void main(String[] args) {
        
        try{
            System.out.println(divisao(2,0));//divisao por zero, aritimetic exception
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }

    public static double divisao(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Argumento b nao pode ser zero");
        }
        return (double) a / b;

        //as vezes, ao inves de usar isso aqui abaixo, e melhor nos lançarmos excecoes.
        /*try{
            return a / b;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        return 0;*/
    }
}
