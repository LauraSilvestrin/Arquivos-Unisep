package br.edu.unisep.Biblioteca.Model;

public class LivroFisico extends Livro {
    private String localizacao;

    public LivroFisico(String titulo, Autor autor, Genero genero, String localizacao) {
        super(titulo, autor, genero);
        this.localizacao = localizacao;
    }

    @Override
    public String obterDetalhes() {
        return "Título: " + titulo + ", Autor: " + autor.getNome() + ", Gênero: " + genero.getDescricao() + ", Localização: " + localizacao;
    }
}
