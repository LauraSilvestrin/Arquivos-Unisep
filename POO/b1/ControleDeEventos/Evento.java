package ControleDeEventos;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Evento(String nome, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    // Apresentar todos os dados do evento
    public void apresentarDados() {
        System.out.println("Nome do Evento: " + nome);
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Fim: " + dataFim);
    }
}