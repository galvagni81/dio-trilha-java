package list.pesquisa;

public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro(String nomeTitulo, String nomeAutor, int ano) {
        this.titulo = nomeTitulo;
        this.autor = nomeAutor;
        this.anoPublicacao = ano;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public String toString(){
        return "\nLivro: \'" + titulo + "\'" +
            "\n\tAutor: \'" + autor + "\'" +
            "\n\tAno: \'" + anoPublicacao + "\'";
    }
}