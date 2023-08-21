package Refatorado;
public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public boolean verificarDisponibilidadeDevolucao(Devolucao devolucao) {
        devolucao.getLocacao();
        return true;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
}
