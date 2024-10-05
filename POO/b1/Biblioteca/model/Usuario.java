package Biblioteca.model;

import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String email, List<Livro> livrosEmprestados) {
        this.nome = nome;
        this.email = email;
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    // Adicionar um livro à lista de livros emprestados
    public void adicionarLivro(Livro livro) {
        this.livrosEmprestados.add(livro);
    }

    // Remover um livro da lista de livros emprestados
    public void removerLivro(Livro livro) {
        this.livrosEmprestados.remove(livro);
    }

    // Exibe detalhes do usuário e seus livros emprestados
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Livros Emprestados: ");
        for (Livro livro : livrosEmprestados) {
            System.out.println("- " + livro.getTitulo());
        }
    }
}
