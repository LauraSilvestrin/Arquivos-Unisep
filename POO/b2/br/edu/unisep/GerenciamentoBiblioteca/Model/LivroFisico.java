class LivroFisico extends Livro {
    private int numeroDePaginas;

    public LivroFisico(String titulo, Autor autor, Genero genero, int numeroDePaginas) {
        super(titulo, autor, genero);
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Livro Físico: " + getTitulo() + " - Autor: " + getAutor().getNome() + " - Gênero: " + getGenero().getNome() + " - Páginas: " + numeroDePaginas);
    }
}