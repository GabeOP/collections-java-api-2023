package main.java.solucoesExercicios.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, String> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, String telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if(!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos() {
    for(Map.Entry<String, String> entry : agendaContatoMap.entrySet()) {
      System.out.println("NOME: " + entry.getKey() + ", TELEFONE: " + entry.getValue());
    }
  }

  public String pesquisarPorNome(String nome) {
    return "NÚMERO DE TELEFONE DE " + nome + " " + agendaContatoMap.get(nome);
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Camila", "9999-9999");
    agendaContatos.adicionarContato("Gabriel", "(21)1234-1234");
    agendaContatos.adicionarContato("Camila Cavalcante", "5555-5555");
    agendaContatos.adicionarContato("Camila DIO", "7777-7777");
    agendaContatos.adicionarContato("Maria Silva", "0000-0000");
    agendaContatos.adicionarContato("Camila", "(00)94444-4444");

    agendaContatos.exibirContatos();
    System.out.println("-------------------------------------");

    agendaContatos.removerContato("Maria Silva");
    agendaContatos.exibirContatos();

    System.out.println("-------------------------------------");
    System.out.println(agendaContatos.pesquisarPorNome("Gabriel"));
  }
}
