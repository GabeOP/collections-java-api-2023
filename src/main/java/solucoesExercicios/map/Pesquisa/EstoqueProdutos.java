package main.java.solucoesExercicios.map.Pesquisa;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> produtoMap;

  public EstoqueProdutos() {
    this.produtoMap = new HashMap<>();
  }

  public void adicionarProduto(Long codigo, String nome, int quantidade, double preco) {
    Produto produto = new Produto(nome, quantidade, preco);
    produtoMap.put(codigo, produto);
  }

  public void exibirProdutos() {
    for(Map.Entry<Long, Produto> entry : produtoMap.entrySet()) {
      System.out.println("CÓDIGO: " + entry.getKey() + " " + entry.getValue());
    }

  }

  public double calcularValorTotalEstoque() {
    double soma = 0;
    for(Map.Entry<Long, Produto> entry : produtoMap.entrySet()) {
      soma += entry.getValue().getPreco() * entry.getValue().getQuantidade();
    }
    return soma;
  }

  public Produto obterProdutoMaisCaro() {
    return produtoMap.values()
            .stream()
            .max(Comparator.comparing(Produto::getPreco)).get();
  }

  public Produto obterProdutoMaisBarato() {
    return produtoMap.values()
            .stream()
            .min(Comparator.comparing(Produto::getPreco)).get();
  }

//  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
//    Produto produtoMaiorQuantidade = null;
//    for(Map.Entry<Long, Produto> entry : produtoMap.entrySet()) {
//
//    }
//  }

  public static void main(String[] args) {

    EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

    estoqueProdutos.adicionarProduto(1L, "Produto 1", 4, 19.90);
    estoqueProdutos.adicionarProduto(2L, "Produto 2", 2, 12.59);
    estoqueProdutos.adicionarProduto(3L, "Produto 3", 1, 1.99);
    estoqueProdutos.adicionarProduto(4L, "Produto 4", 2, 38.00);


    estoqueProdutos.exibirProdutos();

    System.out.println(estoqueProdutos.calcularValorTotalEstoque());

    System.out.println(estoqueProdutos.obterProdutoMaisCaro());
    System.out.println(estoqueProdutos.obterProdutoMaisBarato());


  }
}
