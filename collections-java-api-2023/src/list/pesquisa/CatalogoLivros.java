package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributos
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    // Método para adicionar um livro à Lista
    public void adicionarLivro(String titulo, String autor, int ano){
        this.livroList.add(new Livro(titulo, autor, ano));
    }

    // Método para pesquisar um livro por Autor
    public List<Livro> pesquisarPorAutor(String autor){
        System.out.println("Pesquisa por Autor: \n");
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    // Método para pesquisar um livro por Título
    public List<Livro> pesquisarPorTitulo(String titulo){
        System.out.println("Pesquisa por título: \n");
        List<Livro> livrosPorTitulo = new ArrayList<>();

        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo.add(l);
                    break;
                }
            }
        }

        return livrosPorTitulo;
    }

    // Método para pesquisar um livro num intervalo de anos
    public List<Livro> pesquisarPorIntervalorAnos(int anoInicial, int anoFinal){
        System.out.println("Pesquisa por intervalo de anos: \n");
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();

        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }

        return livrosPorIntervaloAno;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervalorAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
