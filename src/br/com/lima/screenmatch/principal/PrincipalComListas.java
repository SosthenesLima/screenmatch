/*
  By Sósthenes Oliveira Lima
   Araguaína-To 14/05/2024

 */

package br.com.lima.screenmatch.principal;

import br.com.lima.screenmatch.modelos.Filme;
import br.com.lima.screenmatch.modelos.Serie;
import br.com.lima.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        Filme outroFilme = new Filme("Avatar2", 2023);
        var filmeDoSosthenes =  new Filme("Rambo", 1982);
        Serie lost = new Serie("Lost", 2000);;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoSosthenes);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for(Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }


        }
    }
}
