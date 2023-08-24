package main.java.solucoesExercicios.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionario;

  public Dicionario() {
    this.dicionario = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    dicionario.put(palavra, definicao);
  }

  public void removerPalavra(String palavra) {
    if(!dicionario.isEmpty()) {
      dicionario.remove(palavra);
    }
  }

  public void exibirPalavras() {
    for(Map.Entry<String, String> entry : dicionario.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }

  public String pesquisarPorPalavra(String palavra) {
    return "DEFINIÇÃO DE " + palavra + ": " + dicionario.get(palavra);
  }

  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    //Repetindo 'Java' para mostrar que as Chaves de um Map não se repetem
    dicionario.adicionarPalavra("Java", "Linguagem de programação");
    dicionario.adicionarPalavra("Java", "Linguagem de programação");
    dicionario.adicionarPalavra("Python", "Linguagem de programação");
    dicionario.adicionarPalavra("Inusitado", "Característica daquilo que não é usual; que é fora do comum.");
    dicionario.adicionarPalavra("Descrição", "Ação ou resultado de descrever, de detalhar algo ou alguém.");

    dicionario.exibirPalavras();
    System.out.println("-------------------------");

    System.out.println(dicionario.pesquisarPorPalavra("Python"));
    System.out.println("-------------------------");

    dicionario.removerPalavra("Python");
    dicionario.exibirPalavras();
    System.out.println("-------------------------");

    //Vai printar null pois Python foi excluído

    System.out.println(dicionario.pesquisarPorPalavra("Python"));
  }
}
