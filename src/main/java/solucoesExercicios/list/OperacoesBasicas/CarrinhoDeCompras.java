package main.java.solucoesExercicios.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> carrinho;

  public CarrinhoDeCompras() {
    this.carrinho = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    carrinho.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    carrinho.removeIf(n -> n.getNome().equals(nome));
  }

  public double calcularValorTotal() {
    double sum = 0d;
    for(Item item : carrinho) {
      sum += item.getQuantidade() * item.getPreco();
    }
    return sum;
  }

  public void exibirItens() {
    for(Item item : carrinho) {
      System.out.println(
              "NOME: " + item.getNome()
              + " PREÇO: " + item.getPreco()
              + " QUANTIDADE: " + item.getQuantidade()
      );
    }
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    carrinhoDeCompras.adicionarItem("Mouse", 39.90, 9);
    carrinhoDeCompras.adicionarItem("Teclado", 20.00 , 2);
    carrinhoDeCompras.adicionarItem("Monitor", 299.60, 1);
    carrinhoDeCompras.adicionarItem("Gabinete", 99.99, 5);

    carrinhoDeCompras.exibirItens();
    System.out.println("VALOR TOTAL DO CARRINHO: " + carrinhoDeCompras.calcularValorTotal());
  }
}
