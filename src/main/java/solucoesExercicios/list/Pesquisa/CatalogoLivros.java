package main.java.solucoesExercicios.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoLivros {

  private List<Livro> livros;

  public CatalogoLivros() {
    this.livros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livros.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livroPorAutor = new ArrayList<>();

    for(Livro livro : livros) {
      if(livro.getAutor().equals(autor)) {
        livroPorAutor.add(livro);
      }
    }

    return livroPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
     List<Livro> listaLivro = livros.stream()
            .filter(a -> a.getAnoPublicacao() >= anoInicial && a.getAnoPublicacao() <= anoFinal)
             .collect(Collectors.toList());

     return listaLivro;
  }

  public Livro pesquisarPorTitulo(String titulo) {

    Livro livroAchado = null;
    for(Livro livro : livros) {
      if(livro.getTitulo().equals(titulo)) {
        livroAchado = livro;
        break;
      }
    }
    return livroAchado;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
    catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
    catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
    catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
    catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

    System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));

    System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
  }
}
