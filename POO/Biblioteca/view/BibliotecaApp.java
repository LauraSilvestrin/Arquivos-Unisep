package Biblioteca.view;

import Biblioteca.model.Autor;
import Biblioteca.model.Emprestimo;
import Biblioteca.model.Livro;
import Biblioteca.model.Usuario;

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
            System.out.print("Digite o nome do autor " + (i + 1) + ": ");
            input = new Scanner(System.in);

            String nome = input.nextLine();
            String[] nomeCompleto = nome.split(" ");

            System.out.print("Digite a nacionalidade do autor " + (i + 1) + ": ");
            String nacionalidade = input.next();

            Autor autor = new Autor(nomeCompleto[0], nomeCompleto[1], nacionalidade);

            autoresLivro1.add(autor);
        }
        System.out.println("Digite o titulo do livro: ");
        String titulo = input.next();

        System.out.println("Digite o numero de páginas livro: ");
        int paginas = input.nextInt();

        Livro livro = new Livro(titulo, autoresLivro1, paginas);

        System.out.println("Digite o nome do usuario: ");
        input = new Scanner(System.in);
        String nomeUsuario = input.next();

        System.out.println("Digite o email do usuário: ");
        String email = input.next();

        List<Livro> livrosEmprestados = new ArrayList<>();
        Usuario usuario = new Usuario(nomeUsuario, email, livrosEmprestados);
        livrosEmprestados.add(livro);

        usuario.setLivrosEmprestados(livrosEmprestados);
        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataPrevistaDevolucao = dataEmprestimo.plusWeeks(2);

        Emprestimo emprestimo = new Emprestimo(usuario, livro, dataEmprestimo, dataPrevistaDevolucao);
        emprestimo.exibirDetalhes();
    }

}

