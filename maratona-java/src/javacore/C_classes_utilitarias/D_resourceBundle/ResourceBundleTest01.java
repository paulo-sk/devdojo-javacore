package javacore.C_classes_utilitarias.D_resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        //classe que "traduz" labels/mensagens de um arquivo.
        /*Pra isso vc deve ter arquivos x.properties com mensagens em idiomas diferentes
        * mas com o mesmo nome X e dentro do arquivo, devem ter tambem o mesmo nome de chaves*/
        ResourceBundle bundleBR = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
        System.out.println(bundleBR.getString("hello.world"));
        System.out.println(bundleBR.getString("good.morning"));
    }
}
