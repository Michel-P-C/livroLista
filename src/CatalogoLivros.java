import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    //construtor com uma lista vazia sem paramentros
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    //O new inicia como o novo livro add.
    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        livroList.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        // o isEmpty() retorna um boolean ele retorna true
        // se tiver elemento ela retorna fase
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntevaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
                    livrosPorIntevaloAnos.add(l);
                }
            }
        }
        return livrosPorIntevaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTilulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTilulo = l;
                    break;
                }
            }
        }
        return livroPorTilulo;
    }
}
