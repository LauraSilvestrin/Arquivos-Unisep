
class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private boolean devolvido;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.devolvido = false;
        livro.emprestar();
    }

    public void devolver() {
        devolvido = true;
        livro.devolver();
    }

    public boolean isDevolvido() {
        return devolvido;
    }
}