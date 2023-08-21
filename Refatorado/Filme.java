package Refatorado;

public class Filme {
    private static final String FILME_PREFIX = "Filme \"";

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void alugar() {
        if (disponivel) {
            disponivel = false;
            System.out.println(FILME_PREFIX + titulo + "\" alugado.");
        } else {
            System.out.println(FILME_PREFIX + titulo + "\" não está disponível para aluguel.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println(FILME_PREFIX + titulo + "\" devolvido.");
        } else {
            System.out.println("O " + FILME_PREFIX + titulo + "\" já estava disponível.");
        }
    }

    public void alugarParaCliente(Cliente cliente, String dataLocacao) {
        if (disponivel) {
            disponivel = false;
            System.out.println(FILME_PREFIX + titulo + "\" alugado para o cliente " + cliente.getNome() +
                    " em " + dataLocacao);
        } else {
            System.out.println(FILME_PREFIX + titulo + "\" não está disponível para aluguel.");
        }
    }
}
