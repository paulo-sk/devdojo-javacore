package javacore.planetas_exercicio.test;

import javacore.planetas_exercicio.models.Nave;
import javacore.planetas_exercicio.models.Planeta;
import javacore.planetas_exercicio.models.Recurso;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestesUnitarios {

    @Test
    public void deveFicarADerivaQuandoFaltarCombustivelParaIrAteUmPlaneta(){
        int posicaoEsperada = 3;
        Nave milleniumFalcon = new Nave(9);

        ArrayList<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Agua", 180, 10));

        Planeta tatooine = new Planeta(4,recursos);

        milleniumFalcon.explorar(tatooine);
        int posicaoresultante = milleniumFalcon.getPosicao();

        Assert.assertEquals(posicaoresultante, posicaoEsperada);
    }

    @Test
    public void deveTerValorTotalZeradoQuandoNaoExistirNenhumRecurso(){

        int valorTotalEsperado = 0;
        Nave milleniumFalcon = new Nave(9);
        ArrayList<Recurso> recursos = new ArrayList<>();
        Planeta tatooine = new Planeta(4,recursos);

        int valorTotalResultate = tatooine.valorTotal();
        Assert.assertEquals(valorTotalResultate, valorTotalEsperado);
    }

    @Test
    public void deveTerValorTotalQuandoExistirRecursosNoPlaneta(){

        int posicaoEsperada = 600;
        Nave milleniumFalcon = new Nave(9);
        ArrayList<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Agua", 180, 10));
        recursos.add(new Recurso("Oxigênio", 300, 2));
        recursos.add(new Recurso("Ouro", 120, 25));
        Planeta tatooine = new Planeta(4,recursos);

        int valorTotalResultate = tatooine.valorTotal();

        Assert.assertEquals(valorTotalResultate, posicaoEsperada);
    }

    @Test
    public void deveTerValorPorPesoZeradoQuandoNaoExistirNenhumRecurso(){

        int valorPorPesoEsperado = 0;
        ArrayList<Recurso> recursos = new ArrayList<>();
        Planeta tatooine = new Planeta(4,recursos);

        int valorTotalResultate = tatooine.valorPorPeso();

        Assert.assertEquals(valorTotalResultate, valorPorPesoEsperado);
    }

    @Test
    public void deveTerValorPorPesoQuandoExistirRecursosNoPlaneta(){

        int valorPorPesoEsperado = 172;
        ArrayList<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Agua", 180, 10));
        recursos.add(new Recurso("Oxigênio", 300, 2));
        recursos.add(new Recurso("Ouro", 120, 25));
        Planeta tatooine = new Planeta(4,recursos);

        int valorTotalResultate = tatooine.valorPorPeso();

        Assert.assertEquals(valorTotalResultate, valorPorPesoEsperado);
    }
}
