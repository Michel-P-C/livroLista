public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    //O Objeto quando é criado ele só pode se criado
    //com os atributos do construtor.
    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }

    //Vai sob-escrever, toString é para formator o que vai ser mostrado no console
    @Override
    public String toString(){
        return "Livros: "
                + " Tilulo: " + titulo + " Autor: " + autor +
                " Ano de publicação: " + anoDePublicacao;
    }
}
