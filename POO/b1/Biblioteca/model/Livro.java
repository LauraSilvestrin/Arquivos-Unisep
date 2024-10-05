package Biblioteca.model;

import java.util.List;

public class Livro {
    private String titulo;
    private List<Autor> autores;
    private int numeroPaginas;

    public Livro(String titulo, List<Autor> autores, int numeroPaginas) {
        this.titulo = titulo;
        this.autores = autores;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Exibir detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.print("Autor(es): ");
        for (Autor autor : autores) {
            System.out.print(autor.getNome() + " " + autor.getSobrenome() + "; ");
        }
        System.out.println("\nNúmero de Páginas: " + numeroPaginas);
    }
}
