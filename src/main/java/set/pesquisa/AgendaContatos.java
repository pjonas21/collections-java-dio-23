package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            } else return null;
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("jonas", 12345);
        agendaContatos.adicionarContato("vanessa", 1234);
        agendaContatos.adicionarContato("vanessa barros", 1235);

        agendaContatos.exibirContatos();

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("jonas", 123));

        System.out.println(agendaContatos.pesquisarPorNome("vanessa"));
    }
}
