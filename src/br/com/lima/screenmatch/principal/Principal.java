package br.com.lima.screenmatch.principal;/*
By Sósthenes Oliveira Lima
11/04/2024


 */

import br.com.lima.screenmatch.calculos.CalculadoraDeTempo;
import br.com.lima.screenmatch.calculos.FiltroRecomendacao;
import br.com.lima.screenmatch.modelos.Episodio;
import br.com.lima.screenmatch.modelos.Filme;
import br.com.lima.screenmatch.modelos.Serie;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvalicacoes());
        //System.out.println(meuFilme);
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);;
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " +lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar2", 2023);
        meuFilme.avalia(6);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio =  new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoSosthenes =  new Filme("Rambo", 1982);
        meuFilme.avalia(10);
        filmeDoSosthenes.setDuracaoEmMinutos(200);
        filmeDoSosthenes.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoSosthenes);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro Filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do Filme " + listaDeFilmes.get(0).toString());




    }
}