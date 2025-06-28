//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Narnia", "J. Jamir", 2006);
        catalogoLivros.adicionarLivro("Narnia", "J. Jamir", 2010);
        catalogoLivros.adicionarLivro("O home da mascara de ferro", "J. Jamir", 2005);
        catalogoLivros.adicionarLivro("sitanic", "Pedro shumor", 1989);
        catalogoLivros.adicionarLivro("Star wors", "Estiver", 1945);
        catalogoLivros.adicionarLivro("Pirata do Caribe", "Normando", 2001);
        catalogoLivros.adicionarLivro("Matrix", "Neu", 1998);

        System.out.println(catalogoLivros.pesquisarPorAutor("Normando"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1945, 2010));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Narnia"));
    }
}