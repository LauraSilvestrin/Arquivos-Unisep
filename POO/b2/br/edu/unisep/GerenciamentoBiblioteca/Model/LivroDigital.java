
class LivroDigital extends Livro {
    private String formato;

    public LivroDigital(String titulo, Autor autor, Genero genero, String formato) {
        super(titulo, autor, genero);
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Livro Digital: " + getTitulo() + " - Autor: " + getAutor().getNome() + " - Gênero: " + getGenero().getNome() + " - Formato: " + formato);
    }
}


