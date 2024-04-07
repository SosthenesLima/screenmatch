package br.com.lima.screenmatch.modelos;

import br.com.lima.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
  private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
