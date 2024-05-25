/*
  By Sósthenes Oliveira Lima
   Araguaína-To 14/05/2024

 */

package br.com.lima.screenmatch.principal;

import br.com.lima.screenmatch.modelos.Filme;
import br.com.lima.screenmatch.modelos.Serie;
import br.com.lima.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        Filme outroFilme = new Filme("Avatar2", 2023);
        var filmeDoSosthenes =  new Filme("Rambo", 1982);
        Serie lost = new Serie("Lost", 2000);;

        Filme f1 = filmeDoSosthenes;
        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoSosthenes);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for(Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Juliano");
        buscaPorArtista.add("Alessandro");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da Ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de Títulos Ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por Ano");
        System.out.println(lista);

    }
}
