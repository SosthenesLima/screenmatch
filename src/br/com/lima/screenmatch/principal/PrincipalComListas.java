package br.com.lima.screenmatch.principal;

import br.com.lima.screenmatch.modelos.Filme;
import br.com.lima.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        Filme outroFilme = new Filme("Avatar2", 2023);
        var filmeDoSosthenes =  new Filme("Rambo", 1982);
        Serie lost = new Serie("Lost", 2000);;

        ArrayList<Filme> lista = new ArrayList<>();
        lista.add(filmeDoSosthenes);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
    }
}
