package javacore.C_classes_utilitarias.B_strings;

public class StringTest02 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatenaString(10_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String: "+ (fim - inicio)+"ms.");

        System.out.println("");

        long inicioSb = System.currentTimeMillis();
        concatenaStringBuilder(10_000);
        long fimSb = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: "+ (fimSb - inicioSb)+"ms.");
    }

    public static void concatenaString(int tamanho){
        String nome = "";
        for(int i =0; i < tamanho; i++){
            nome += i;
        }
    }

    public static void concatenaStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho); //pode receber o tamanho.
        for(int i =0; i < tamanho; i++){
            sb.append(i);
        }
    }
}
