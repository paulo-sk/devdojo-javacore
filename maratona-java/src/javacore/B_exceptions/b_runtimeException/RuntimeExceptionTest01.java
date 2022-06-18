package javacore.B_exceptions.b_runtimeException;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //NullPointerException
        Object objetc = null;
        System.out.println(objetc.toString());

        //ArrayIndexOutOfBoundsException
        int[] numeros = new int[] {2,3,4};
        //System.out.println(numeros[9]);
    }
}
