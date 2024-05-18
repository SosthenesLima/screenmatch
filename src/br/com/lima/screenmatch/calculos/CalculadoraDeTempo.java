/*
  By Sósthenes Oliveira Lima
    Atualização

 */
package br.com.lima.screenmatch.calculos;

import br.com.lima.screenmatch.modelos.Filme;
import br.com.lima.screenmatch.modelos.Serie;
import br.com.lima.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
