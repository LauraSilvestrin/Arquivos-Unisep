package br.edu.unisep.Biblioteca.Model;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private boolean devolvido;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.devolvido = false;
    }

    public void devolver() {
        devolvido = true;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
