package br.edu.unisep.Biblioteca.Model;

public abstract class Livro {
    protected String titulo;
    protected Autor autor;
    protected Genero genero;

    public Livro(String titulo, Autor autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public abstract String obterDetalhes();

    public String getTitulo() {
        return titulo;
    }
}
