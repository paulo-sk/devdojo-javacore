package javacore.B_exceptions.d_try_with_resources;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando arquivo 1.");
    }
}
