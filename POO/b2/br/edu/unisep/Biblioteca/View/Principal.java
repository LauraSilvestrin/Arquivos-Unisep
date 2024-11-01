package br.edu.unisep.Biblioteca.View;

import br.edu.unisep.Biblioteca.Model.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        // Exemplo de uso
        Autor autor1 = new Autor("J.K. Rowling");
        Genero genero1 = new Genero("Fantasia");
        Livro livro1 = new LivroFisico("Harry Potter e a Pedra Filosofal", autor1, genero1, "Estante 1");

        biblioteca.cadastrarLivro(livro1);

        Usuario usuario1 = new Usuario("João");
        biblioteca.cadastrarUsuario(usuario1);

        biblioteca.realizarEmprestimo(livro1, usuario1);
        biblioteca.consultarLivrosDisponiveis();

        biblioteca.devolverLivro(livro1, usuario1);
        biblioteca.consultarLivrosDisponiveis();

        scanner.close();
    }
}
