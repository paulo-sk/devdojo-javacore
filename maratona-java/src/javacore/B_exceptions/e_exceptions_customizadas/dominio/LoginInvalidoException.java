package javacore.B_exceptions.e_exceptions_customizadas.dominio;

public class LoginInvalidoException extends Exception{

    //mensagem padrao caso caso nao tenha mensagem na hora de tratar o errro.

    public LoginInvalidoException() {
        System.out.println("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
