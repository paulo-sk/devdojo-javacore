package javacore.B_exceptions.e_exceptions_customizadas.test;

import javacore.B_exceptions.e_exceptions_customizadas.dominio.LoginInvalidoException;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();

        }
    }

    public static void logar() throws LoginInvalidoException {
        String username = "goku";
        String password = "1337";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Login: ");
        String login = entrada.next();

        System.out.println("Senha: ");
        String senha = entrada.next();

        if(!login.equals(username) || !senha.equals(password)){
            throw new LoginInvalidoException();
        }

        System.out.println("usuario logado com sucesso!");
    }
}
