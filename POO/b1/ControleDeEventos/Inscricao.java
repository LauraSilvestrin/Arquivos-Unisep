package ControleDeEventos;
import java.time.LocalDate;
import java.util.List;

public class Inscricao {
    private Participante participante;
    private Sessao sessao;
    private LocalDate dataInscricao;

    public Inscricao(Participante participante, Sessao sessao, LocalDate dataInscricao) {
        this.participante = participante;
        this.sessao = sessao;
        this.dataInscricao = dataInscricao;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDate dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    // Apresentar todos os dados da inscrição
    public void apresentarDados() {
        System.out.println("Nome do Participante: " + participante.getNome());
        System.out.println("Sessão: " + sessao.getNome());
        System.out.println("Evento: " + sessao.getEvento().getNome());
        System.out.println("Data de Início da Sessão: " + sessao.getEvento().getDataInicio());
        System.out.println("Data de Fim da Sessão: " + sessao.getEvento().getDataFim());
        System.out.println("Data de Inscrição: " + dataInscricao);
    }

}

