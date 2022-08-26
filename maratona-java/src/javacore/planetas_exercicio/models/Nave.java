package javacore.planetas_exercicio.models;

import java.util.ArrayList;
import java.util.Comparator;

public class Nave {
    private int combustivel;
    private int posicao = 0;

    public Nave(int combustivel) {
        this.combustivel = combustivel;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public int getPosicao() {
        return posicao;
    }



    //metodo explorar recebendo array de planetas
    public ArrayList<Planeta> explorar(ArrayList<Planeta> planetas){
        /*ordenando lista de planetas comparando sua posicao.
        (os planetas com uma posicao mais
        * distantes fiquem por ultimo)*/
        planetas.sort(Comparator.comparing(Planeta::getPosicao));

        //lista que seŕa retornada no método.
        ArrayList<Planeta> plnt = new ArrayList<Planeta>();

        //indo explorar
        for(Planeta ptemp: planetas){
            //verifica se a nave tem combustivel para ir até o proximo planeta
            int distancia = ptemp.getPosicao() - this.posicao;
            if((distancia * 3) <= this.combustivel){
                this.posicao = ptemp.getPosicao();
                this.combustivel -= distancia * 3;
                plnt.add(ptemp);
            }

            //caso a nave tenha combustivel, mas nao o suficiente para o proximo planeta
            else if(this.combustivel < (distancia*3) && this.combustivel >= 3){
                this.posicao += this.combustivel / 3;
                this.combustivel = 0;
            }
        }

        //voltando da exploracao
        /*Se a nave está voltando, é pq ela foi até o ultimo planeta, que é a posicao atual da nave*/
        while(this.combustivel >= 3 && this.posicao > 0){
            this.posicao--;
            this.combustivel -= 3;
        }
        return plnt;

    }

    //overload do método explorar
    public ArrayList<Recurso> explorar(Planeta p){

        ArrayList<Recurso> r = new ArrayList<>();

        //indo explorar
        int distancia = p.getPosicao() - this.posicao;
        if((distancia * 3) <= this.combustivel){
            this.posicao = p.getPosicao();
            this.combustivel -= distancia * 3;
            for(Recurso rtemp: p.getRecursos()){
                r.add(rtemp);
            }
        }
        //caso a nave tenha combustivel, mas nao o suficiente para o proximo planeta
        else if(this.combustivel < (distancia*3) && this.combustivel >= 3){
            this.posicao += this.combustivel / 3;
            this.combustivel = 0;
        }

        //voltando da exploracao
        /*Se a nave está voltando, é pq ela foi até o ultimo planeta, que é a posicao atual da nave*/
        while(this.combustivel >= 3 && this.posicao > 0){
            this.posicao--;
            this.combustivel -= 3;
        }
        return r;

    }

}
