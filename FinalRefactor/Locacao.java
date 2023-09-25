package FinalRefactor;
public class Locacao {
    private Cliente cliente;
    private Filme filme;
    private String dataLocacao;

    public Locacao(Cliente cliente, Filme filme, String dataLocacao) {
        this.cliente = cliente;
        this.filme = filme;
        this.dataLocacao = dataLocacao;
    }

    public void imprimirInformacoes() {
        System.out.println("Locação - Cliente: " + cliente.getNome() + " | Filme: " + filme.getTitulo() +
                " | Data: " + dataLocacao);
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public String getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
    
    
}
