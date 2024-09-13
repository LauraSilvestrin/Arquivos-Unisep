package Biblioteca.model;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("*       Biblioteca App       *");
        System.out.println("*    Registrar emprestimo    *");
        System.out.println("******************************");

        List<Autor> autoresLivro1 = new ArrayList<>();


        System.out.println("Quantos autores possui o livro? ");
        int autores = input.nextInt();
        for (int i = 0; i < autores; i++) {
            System.out.print("Didite o nome do autor " + (i + 1) + ": ");
            input = new Scanner(System.in);
            //String outroNome = JOptionPane.showInputDialog("Digite o nome");
            String nome = input.nextLine();
            String[] nomeCompleto = nome.split(" ");

            System.out.print("Didite a nacionalidade do autor " + (i + 1) + ": ");
            String nacionalidade = input.next();

            Autor autor = new Autor(nomeCompleto[0], nomeCompleto[1], nacionalidade);

            autoresLivro1.add(autor);
        }
        System.out.println("Digite o titulo do livro: ");
        String titulo = input.next();
        System.out.println("Digite o numero de páginas livro: ");
        int paginas = input.nextInt();

        Livro livro = new Livro(titulo, autoresLivro1, paginas);
        List<Livro> livrosEmprestados = new ArrayList<>();
        Usuario usuario = new Usuario("João Silva", "joao.silva@example.com", livrosEmprestados);

        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataPrevistaDevolucao = dataEmprestimo.plusWeeks(2);

        Emprestimo emprestimo = new Emprestimo(usuario, livro, dataEmprestimo, dataPrevistaDevolucao);
        emprestimo.exibirDetalhes();
    }

}

