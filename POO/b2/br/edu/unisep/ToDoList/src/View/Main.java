package View;

import Model.*;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        boolean executando = true;

        while (executando) {
            String opcao = JOptionPane.showInputDialog(
                    "Selecione uma opção:\n\n" +
                            "1. Adicionar tarefa\n" +
                            "2. Marcar tarefa como concluida\n" +
                            "3. Remover tarefa\n" +
                            "4. Exibir todas as tarefas\n" +
                            "5. Sair"
            );

            if (opcao == null) break;clube
                    cl

            switch (opcao) {
                case "1":
                    AcoesTarefa.adicionarTarefa(gerenciador);
                    break;
                case "2":
                    AcoesTarefa.marcarTarefaComoConcluida(gerenciador);
                    break;
                case "3":
                    AcoesTarefa.removerTarefa(gerenciador);
                    break;
                case "4":
                    AcoesTarefa.exibirTarefas(gerenciador);
                    break;
                case "5":
                    executando = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida!");
            }
        }

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}