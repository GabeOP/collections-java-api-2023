package main.java.solucoesExercicios.list.Pesquisa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SomaNumeros {
  private List<Integer> numeros;

  public SomaNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numeros.add(numero);
  }

  public int calcularSoma() {
    return numeros.stream()
            .reduce(0, (x, y) -> x + y);
  }

  public int encontrarMaiorNumero() {
    return numeros.stream()
            .max(Integer::compare).get();
  }

  public int encontrarMenorNumero() {
    return numeros.stream()
            .min(Integer::compare).get();
  }

  public List<Integer> exibirNumeros() {
    return numeros;
  }

  public static void main(String[] args) {

    SomaNumeros somaNumeros = new SomaNumeros();

    somaNumeros.adicionarNumero(1);
    somaNumeros.adicionarNumero(1);
    somaNumeros.adicionarNumero(2);
    somaNumeros.adicionarNumero(4);
    somaNumeros.adicionarNumero(5);

    System.out.println(somaNumeros.calcularSoma());

    System.out.println(somaNumeros.encontrarMaiorNumero());
    System.out.println(somaNumeros.encontrarMenorNumero());

    System.out.println(somaNumeros.exibirNumeros());
  }
}
