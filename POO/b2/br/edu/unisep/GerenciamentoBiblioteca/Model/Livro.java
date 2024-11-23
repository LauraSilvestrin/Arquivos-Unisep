public abstract class Livro {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private boolean disponivel; // Indica se o livro está disponível para empréstimo

    public Livro(String titulo, Autor autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true; // Por padrão, o livro é disponibilizado ao ser criado
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        } else {
            throw new IllegalStateException("O livro já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
        } else {
            throw new IllegalStateException("O livro já está disponível.");
        }
    }

    @Override
    public String toString() {
        return titulo + " - " + autor.getNome() + " (" + genero.getNome() + ") - " +
                (disponivel ? "Disponível" : "Emprestado");
    }

    public abstract void exibirInfo();
}