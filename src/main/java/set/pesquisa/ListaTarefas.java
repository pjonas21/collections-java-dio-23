package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemover = t;
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) tarefasConcluidas.add(t);
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) tarefasPendentes.add(t);
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                tarefaConcluida = t;
                break;
            }
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao) && t.isConcluida()) {
                t.setConcluida(false);
                tarefaPendente = t;
                break;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
        System.out.println("Lista tarefas: " + tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("fazer compras");
        listaTarefas.adicionarTarefa("trabalhar");

        listaTarefas.exibirTarefas();

        System.out.println("Quantidade de tarefas na lista: " + listaTarefas.contarTarefas());

        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        System.out.println("Tarefa concluida: " + listaTarefas.marcarTarefaConcluida("trabalhar"));
        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());

        System.out.println("Tarefa pendente: " + listaTarefas.marcarTarefaPendente("trabalhar"));

        listaTarefas.limparListaTarefas();

    }
}
