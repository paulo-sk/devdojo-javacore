package javacore.planetas_exercicio.models;

public class Recurso {
    private String nome;
    private int valor;
    private int peso;

    public Recurso(String nome, int valor, int peso) {
        this.nome = nome;
        this.valor = valor;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", peso=" + peso +
                '}';
    }

    //getts and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
