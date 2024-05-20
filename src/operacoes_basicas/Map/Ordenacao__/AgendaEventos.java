package operacoes_basicas.Map.Ordenacao__;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    //atributos

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));


    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);

        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        // Set<LocalDate> dataSet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();
        //  eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }

        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15),"Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9),"Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10),"Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 12),"Evento 4", "Atração 4  ");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20),"Evento 6", "Atração 6  ");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();




    }
}
