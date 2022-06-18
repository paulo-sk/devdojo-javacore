package javacore.B_exceptions.a_errors;

public class StackOverflowError {
    public static void main(String[] args) {
        recursive();
    }

    public static void recursive(){
        recursive();
    }
}
