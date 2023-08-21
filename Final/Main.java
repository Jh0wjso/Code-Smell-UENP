package Final;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Filme 1", 2000);
        Filme filme2 = new Filme("Filme 2", 2010);

        Cliente cliente1 = new Cliente("Cliente 1");

        Locacao locacao1 = new Locacao(cliente1, filme1, "2023-08-11");
        Devolucao devolucao1 = new Devolucao(locacao1, "2023-08-15");

        Funcionario funcionario1 = new Funcionario("Funcionário 1", "Atendente");
        funcionario1.registrarDevolucao(devolucao1);

        Estoque estoque = new Estoque();
        estoque.adicionarFilme(filme1);
        estoque.adicionarFilme(filme2);

        Relatorio relatorio = new Relatorio();
        List<Locacao> locacoes = new ArrayList<>();
        locacoes.add(locacao1);
        relatorio.gerarRelatorioLocacoes(locacoes);

        List<Devolucao> devolucoes = new ArrayList<>();
        devolucoes.add(devolucao1);
        relatorio.gerarRelatorioDevolucoes(devolucoes);
    }
}
