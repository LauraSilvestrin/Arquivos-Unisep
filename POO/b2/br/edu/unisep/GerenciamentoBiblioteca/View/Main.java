import javax.swing.*;
import java.util.List;
import import br.edu.unisep.Gerenciamento_Biblioteca*;
public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            String menu = "1. Cadastrar Livro\n2. Consultar Livros Disponíveis\n3. Cadastrar Usuário\n4. Realizar Empréstimo\n5. Devolver Livro\n6. Sair";
            String opcao = JOptionPane.showInputDialog(menu);
            switch (opcao) {
                case "1":
                    cadastrarLivro(biblioteca);
                    break;
                case "2":
                    consultarLivros(biblioteca);
                    break;
                case "3":
                    cadastrarUsuario(biblioteca);
                    break;
                case "4":
                    realizarEmprestimo(biblioteca);
                    break;
                case "5":
                    devolverLivro(biblioteca);
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    public static void cadastrarLivro(Biblioteca biblioteca) {
        String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
        String autorNome = JOptionPane.showInputDialog("Digite o nome do autor:");
        String generoNome = JOptionPane.showInputDialog("Digite o gênero do livro:");
        Autor autor = new Autor(autorNome);
        Genero genero = new Genero(generoNome);
        String tipoLivro = JOptionPane.showInputDialog("Tipo de Livro: 1 - Físico, 2 - Digital");

        Livro livro = null;
        if (tipoLivro.equals("1")) {
            int paginas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de páginas:"));
            livro = new LivroFisico(titulo, autor, genero, paginas);
        } else if (tipoLivro.equals("2")) {
            String formato = JOptionPane.showInputDialog("Digite o formato do livro digital:");
            livro = new LivroDigital(titulo, autor, genero, formato);
        }

        biblioteca.adicionarLivro(livro);
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
    }

    public static void consultarLivros(Biblioteca biblioteca) {
        List<Livro> livrosDisponiveis = biblioteca.consultarLivrosDisponiveis();
        if (livrosDisponiveis.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum livro disponível.");
        } else {
            StringBuilder sb = new StringBuilder("Livros disponíveis:\n");
            for (Livro livro : livrosDisponiveis) {
                sb.append(livro.getTitulo()).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    public static void cadastrarUsuario(Biblioteca biblioteca) {
        String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
        String email = JOptionPane.showInputDialog("Digite o e-mail do usuário:");
        Usuario usuario = new Usuario(nome, email);
        biblioteca.adicionarUsuario(usuario);
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
    }

    public static
