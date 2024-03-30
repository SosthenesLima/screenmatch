public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvalicacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        somaDasAvaliacoes++;


    }
}
