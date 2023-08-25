package main.java.solucoesExercicios.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefas {
  private List<Tarefa> tarefasList;

  public ListaTarefas() {
    this.tarefasList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {

    tarefasList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    for(Tarefa tarefa : tarefasList) {
      if(tarefa.getDescricao().equals(descricao)) {
        tarefasList.remove(tarefa);
      }
    }
  }

  public int obterNumeroTotalTarefas() {
    int sum = 0;
    for(Tarefa tarefa : tarefasList) {
      sum++;
    }

    return sum;
  }

  public List<String> obterDescricoesTarefas() {
    return tarefasList.stream()
            .map(t -> t.getDescricao())
            .collect(Collectors.toList());
  }

  public static void main(String[] args) {

    ListaTarefas lista = new ListaTarefas();

    lista.adicionarTarefa("Testando descrição 1");
    lista.adicionarTarefa("Testando descrição 2");
    lista.adicionarTarefa("Testando descrição 3");

    System.out.println(lista.obterNumeroTotalTarefas());
    System.out.println(lista.obterDescricoesTarefas());

    lista.removerTarefa("Testando descrição 2");

    System.out.println(lista.obterNumeroTotalTarefas());
    System.out.println(lista.obterDescricoesTarefas());
  }
}
