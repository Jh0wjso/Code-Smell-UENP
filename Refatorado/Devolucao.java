package Refatorado;

public class Devolucao {
    private Locacao locacao;
    private String dataDevolucao;

    public Devolucao(Locacao locacao, String dataDevolucao) {
        this.locacao = locacao;
        this.dataDevolucao = dataDevolucao;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }
}
