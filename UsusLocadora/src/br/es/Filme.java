package br.es;
public class Filme {
    private String titulo;
    private int ano;
    private boolean disponivel;

    public Filme(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void alugar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Filme \"" + titulo + "\" alugado.");
        } else {
            System.out.println("Filme \"" + titulo + "\" não está disponível para aluguel.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Filme \"" + titulo + "\" devolvido.");
        } else {
            System.out.println("O filme \"" + titulo + "\" já estava disponível.");
        }
    }

    public void alugarParaCliente(Cliente cliente, String dataLocacao) {
        if (disponivel) {
            disponivel = false;
            System.out.println("Filme \"" + titulo + "\" alugado para o cliente " + cliente.getNome() +
                    " em " + dataLocacao);
        } else {
            System.out.println("Filme \"" + titulo + "\" não está disponível para aluguel.");
        }
    }
}
