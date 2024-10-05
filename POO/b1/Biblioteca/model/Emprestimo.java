package Biblioteca.model;

import java.time.LocalDate;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, LocalDate dataEmprestimo, LocalDate dataPrevistaDevolucao) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    // Exibe detalhes do empréstimo
    public void exibirDetalhes() {
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Data de Empréstimo: " + dataEmprestimo);
        System.out.println("Data Prevista para Devolução: " + dataPrevistaDevolucao);
    }
}
