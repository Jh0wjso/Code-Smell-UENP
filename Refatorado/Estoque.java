package Refatorado;
import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<Filme> filmesDisponiveis;

    public Estoque() {
        filmesDisponiveis = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }
}
