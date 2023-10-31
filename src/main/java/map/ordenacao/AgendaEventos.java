package main.java.map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public Evento obterProximoEvento() {
        Evento proximoEvento = null;
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximoEvento = entry.getValue();
                break;
            }
        }
        return proximoEvento;
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.exibirAgenda();

        agenda.adicionarEvento(LocalDate.parse("2023-10-29"), "Evento 1", "Atracao 1");
        agenda.adicionarEvento(LocalDate.parse("2023-10-31"), "Evento 2", "Atracao 2");
        agenda.adicionarEvento(LocalDate.parse("2023-10-30"), "Evento 3", "Atracao 3");
        agenda.adicionarEvento(LocalDate.parse("2023-11-01"), "Evento 4", "Atracao 4");

        agenda.exibirAgenda();

        System.out.println("Proximo evento: " + agenda.obterProximoEvento());
    }
}
