package Refatorado;
class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaro() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void registrarDevolucao(Devolucao devolucao) {
        Locacao locacao = devolucao.getLocacao();
        System.out.println("Devolução registrada por " + nome + " - Filme: " + locacao.getFilme().getTitulo() +
                " - Cliente: " + locacao.getCliente().getNome() + " - Data de Devolução: " + devolucao.getDataDevolucao());
    }
}
