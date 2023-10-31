package lista07.ex02;

import lista07.ex01.Tributavel;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeImpostoDeRenda  {
    private List<Tributavel> tributaveis = new ArrayList<>();

    public double adicionar(Tributavel tributavel){
        double total = 0;
        tributaveis.add(tributavel);
        for (tributavel  : tributaveis) {
            total += numero;
        }
        return total;
    }

}
