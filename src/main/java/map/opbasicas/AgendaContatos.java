package main.java.map.opbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    // atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroTelefone = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroTelefone = agendaContatoMap.get(nome);
        }
        return numeroTelefone;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("jonas", 12345);
        agendaContatos.adicionarContato("vanessa", 1234);
        agendaContatos.adicionarContato("vanessa barros", 1235);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("jonas");
        agendaContatos.exibirContatos();

        System.out.println("Numero encontrado: " + agendaContatos.pesquisarPorNome("vanessa"));
    }
}
