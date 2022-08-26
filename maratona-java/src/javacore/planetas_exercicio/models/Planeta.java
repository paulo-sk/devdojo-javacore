package javacore.planetas_exercicio.models;

import java.util.ArrayList;

public class Planeta {

    private int posicao;
    private ArrayList<Recurso> recursos;

    public Planeta(int posicao, ArrayList<Recurso> recursos) {
        this.posicao = posicao;
        this.recursos = recursos;
    }

    public int valorTotal(){
        int total = 0;
        for(Recurso rtemp: this.recursos){
            total += rtemp.getValor();
        }
        return total;
    }

    public int valorPorPeso(){
        int valorPeso = 0;
        for(Recurso rtemp: this.recursos){
            valorPeso += rtemp.getValor() /rtemp.getPeso();
        }
        return valorPeso;
    }


    public int getPosicao() {
        return posicao;
    }

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(ArrayList<Recurso> recursos) {
        this.recursos = recursos;
    }

    @Override
    public String toString() {
        return "Planeta explorado{" +
                ", posicao=" + posicao +
                ", recursos explorados=" + recursos +
                '}';
    }
}
