package Refatorado;
import java.util.List;

class Relatorio {
    public void gerarRelatorioLocacoes(List<Locacao> locacoes) {
        System.out.println("Relatório de Locações:");
        for (Locacao locacao : locacoes) {
            System.out.println("Cliente: " + locacao.getCliente().getNome() +
                    " - Filme: " + locacao.getFilme().getTitulo() +
                    " - Data de Locação: " + locacao.getDataLocacao());
        }
    }

    public void gerarRelatorioDevolucoes(List<Devolucao> devolucoes) {
        System.out.println("Relatório de Devoluções:");
        for (Devolucao devolucao : devolucoes) {
            Locacao locacao = devolucao.getLocacao();
            System.out.println("Cliente: " + locacao.getCliente().getNome() +
                    " - Filme: " + locacao.getFilme().getTitulo() +
                    " - Data de Devolução: " + devolucao.getDataDevolucao());
        }
    }
}
