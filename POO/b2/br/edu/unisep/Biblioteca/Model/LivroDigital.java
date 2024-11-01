package br.edu.unisep.Biblioteca.Model;

public class LivroDigital extends Livro {
    private String url;

    public LivroDigital(String titulo, Autor autor, Genero genero, String url) {
        super(titulo, autor, genero);
        this.url = url;
    }

    @Override
    public String obterDetalhes() {
        return "Título: " + titulo + ", Autor: " + autor.getNome() + ", Gênero: " + genero.getDescricao() + ", URL: " + url;
    }
}
