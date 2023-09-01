package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaTarefa;

    private ListaTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for(Tarefa t : listaTarefa) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
        }
        listaTarefa.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefa.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listaTarefa);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Numero total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Comprar agua");
        listaTarefas.adicionarTarefa("Comprar pao");
        listaTarefas.adicionarTarefa("Pagar boleto");
        listaTarefas.adicionarTarefa("Pagar energia");

        System.out.println("Numero total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        System.out.println("Tarefas a realizar: ");

        listaTarefas.removerTarefa("Pagar boleto");
        System.out.println("Numero total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
