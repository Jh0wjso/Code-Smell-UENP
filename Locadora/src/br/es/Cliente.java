package br.es;
public class Cliente {
    private String nome;
    private String cpf;
    private String idade;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public boolean verificarDisponibilidadeDevolucao(Devolucao devolucao) {
        Locacao locacao = devolucao.getLocacao();
        return true;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
    
}
