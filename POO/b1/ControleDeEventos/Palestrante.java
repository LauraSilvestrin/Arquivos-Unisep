package ControleDeEventos;

public class Palestrante {
    private String nome;
    private Evento evento;

    public Palestrante(String nome, Evento evento) {
        this.nome = nome;
        this.evento = evento;
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

    // Apresentar todos os dados do palestrante
    public void apresentarDados() {
        System.out.println("Nome do Palestrante: " + nome);
        System.out.println("Evento: " + evento.getNome());
        System.out.println("Data de Início do Evento: " + evento.getDataInicio());
        System.out.println("Data de Fim do Evento: " + evento.getDataFim());
    }
}