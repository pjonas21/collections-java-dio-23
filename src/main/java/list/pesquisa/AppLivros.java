package main.java.list.pesquisa;

import java.util.List;

public class AppLivros {

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Titulo1", "Autor1", 2010);
        catalogo.adicionarLivro("Titulo2", "Autor1", 2011);
        catalogo.adicionarLivro("Titulo3", "Autor2", 2010);
        catalogo.adicionarLivro("Titulo1", "Autor2", 2013);
        catalogo.adicionarLivro("Titulo5", "Autor1", 2014);
        catalogo.adicionarLivro("Titulo6", "Autor1", 2017);
        catalogo.adicionarLivro("Titulo7", "Autor2", 2020);

        List<Livro> livrosPorAutor = catalogo.pesquisarPorAutor("Autor2");
        System.out.println("Livros por autor: ");
        System.out.println(livrosPorAutor);

        List<Livro> livrosPorIntervaloAnos = catalogo.pesquisarPorIntervaloAnos(2014, 2019);
        System.out.println("Livros por intervalo de anos: ");
        System.out.println(livrosPorIntervaloAnos);

        Livro livroPorTitulo = catalogo.pesquisarPorTitulo("Titulo1");
        System.out.println("Livro por titulo: ");
        System.out.println(livroPorTitulo);
    }
}
