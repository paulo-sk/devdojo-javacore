package javacore.planetas_exercicio.test;

import javacore.planetas_exercicio.models.Nave;
import javacore.planetas_exercicio.models.Planeta;
import javacore.planetas_exercicio.models.Recurso;

import java.util.ArrayList;

public class PlantaRecursoTest {

    public static void main(String[] args) {

        Recurso r1 = new Recurso("Agua", 180, 10);
        Recurso r2 = new Recurso("Oxigenio", 300, 2);
        Recurso r3 = new Recurso("Ouro", 120, 25);
        Recurso r4 = new Recurso("Silicio", 60, 16);
        Recurso r5 = new Recurso("Ferro", 30, 32);

        ArrayList<Recurso> recursosP1 = new ArrayList<Recurso>();
        recursosP1.add(r1);
        recursosP1.add(r2);
        recursosP1.add(r3);

        ArrayList<Recurso> recursosP2 = new ArrayList<Recurso>();
        recursosP2.add(r4);
        recursosP2.add(r5);

        Planeta p1 = new Planeta(6, recursosP1);
        Planeta p2 = new Planeta( 2, recursosP2);

        ArrayList<Planeta> planetas = new ArrayList<Planeta>();
        planetas.add(p1);
        planetas.add(p2);

        Nave nv = new Nave( 36);
        System.out.println("\nInformaçoes sobre cada planeta explorado: ");
        //"para cada planeta explorado
        int valorTotalTodosOsPlanetas = 0;
        double pesoTodosOsPlanetas = 0;

        for (Planeta p: nv.explorar(planetas)){
            valorTotalTodosOsPlanetas += p.valorTotal();
            pesoTodosOsPlanetas += p.valorPorPeso();

            for(Recurso r: p.getRecursos()){
                System.out.println(r);
            }
            System.out.println("valor total: "+p.valorTotal());
            System.out.println("valor por peso: "+ p.valorPorPeso());
        }

        System.out.println("\nvalor total de recursos explorados: "+valorTotalTodosOsPlanetas);
        System.out.println("peso total de recursos explorados: "+pesoTodosOsPlanetas);

        System.out.println("\nInformaçoes da nave: ");
        System.out.println("posicao da nave: "+nv.getPosicao());
        System.out.println("Combustivel restante: "+nv.getCombustivel());

    }
}
