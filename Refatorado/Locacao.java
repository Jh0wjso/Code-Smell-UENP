package Refatorado;
public class Locacao {
    private Cliente cliente;
    private Filme filme;
    private String dataLocacao;

    public Locacao(Cliente cliente, Filme filme, String dataLocacao) {
        this.cliente = cliente;
        this.filme = filme;
        this.dataLocacao = dataLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }
}
