package main.java.solucoesExercicios.map.Ordenacao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LivrariaOnline {
  private Map<String, Livro> livrariaMap;

  public LivrariaOnline() {
    this.livrariaMap = new HashMap<>();
  }

  public void adicionarLivro(String link, Livro livro) {
    livrariaMap.put(link, livro);
  }

  public void removerLivro(String titulo) {
    Livro livro = livrariaMap.values().stream()
            .filter(l -> l.getTitulo().equals(titulo))
            .findFirst().get();

    if (livro != null) {
      livrariaMap.remove(livro);
    }
  }

  public void exibirLivrosOrdenadosPorPreco() {
    System.out.println(livrariaMap.values().stream().sorted());
  }

  public void pesquisarLivrosPorAutor(String autor) {
    List<String> lista = livrariaMap.values().stream()
            .filter(a -> a.getAutor().equals(autor))
            .map(l -> l.getTitulo())
            .collect(Collectors.toList());
  }
}
