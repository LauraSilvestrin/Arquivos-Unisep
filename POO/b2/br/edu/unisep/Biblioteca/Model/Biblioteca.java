package br.edu.unisep.Biblioteca.Model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(Livro livro, Usuario usuario) {
        if (livros.contains(livro) && !emprestimos.stream().anyMatch(e -> e.getLivro().equals(livro) && !e.isDevolvido())) {
            emprestimos.add(new Emprestimo(livro, usuario));
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro, Usuario usuario) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro) && emprestimo.getUsuario().equals(usuario) && !emprestimo.isDevolvido()) {
                emprestimo.devolver();
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Empréstimo não encontrado.");
    }

    public void consultarLivrosDisponiveis() {
        for (Livro livro : livros) {
            boolean emprestado = emprestimos.stream().anyMatch(e -> e.getLivro().equals(livro) && !e.isDevolvido());
            if (!emprestado) {
                System.out.println(livro.obterDetalhes());
            }
        }
    }
}

