import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void cadastrarEmprestimo(Livro livro, Usuario usuario) {
        if (livro.isDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, usuario);
            emprestimos.add(emprestimo);
        } else {
            JOptionPane.showMessageDialog(null, "Livro não disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        for (Emprestimo emp : emprestimos) {
            if (emp.isDevolvido() == false) {
                emp.devolver();
                JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Este livro já foi devolvido.");
    }

    public List<Livro> consultarLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }
}
