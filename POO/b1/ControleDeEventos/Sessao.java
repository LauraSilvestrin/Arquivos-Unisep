package ControleDeEventos;

import java.time.LocalDate;
import java.util.List;

public class Sessao {
    private String nome;
    private Evento evento;
    private List<Palestrante> palestrantes;

    public Sessao(String nome, Evento evento, List<Palestrante> palestrantes) {
        this.nome = nome;
        this.evento = evento;
        this.palestrantes = palestrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Palestrante> getPalestrantes() {
        return palestrantes;
    }

    public void setPalestrantes(List<Palestrante> palestrantes) {
        this.palestrantes = palestrantes;
    }

    // Apresentar os dados da sessão
    public void apresentarDados() {
        System.out.println("Nome da Sessão: " + nome);
        System.out.println("Evento: " + evento.getNome());
        System.out.println("Data de Início do Evento: " + evento.getDataInicio());
        System.out.println("Data de Fim do Evento: " + evento.getDataFim());
        System.out.println("Palestrantes:");
        for (Palestrante palestrante : palestrantes) {
            System.out.println("- " + palestrante.getNome());
        }
    }
}