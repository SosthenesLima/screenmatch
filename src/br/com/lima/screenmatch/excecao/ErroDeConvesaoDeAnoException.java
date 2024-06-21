package br.com.lima.screenmatch.excecao;

public class ErroDeConvesaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConvesaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
