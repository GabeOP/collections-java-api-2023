package main.java.solucoesExercicios.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  private Map<String, Integer> quantidadeAparece;

  public ContagemPalavras() {
    this.quantidadeAparece = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem) {
    quantidadeAparece.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    quantidadeAparece.remove(palavra);
  }

  public Integer exibirContagemPalavras() {
    return quantidadeAparece.values().stream()
            .reduce(0, (x, y) -> x+y);
  }

  public static void main(String[] args) {
    ContagemPalavras contagemPalavras = new ContagemPalavras();

    contagemPalavras.adicionarPalavra("Palavra 1", 2);
    contagemPalavras.adicionarPalavra("Palavra 2", 5);

    System.out.println(contagemPalavras.exibirContagemPalavras());
  }
}