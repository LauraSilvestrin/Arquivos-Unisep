package Model;

import javax.swing.JOptionPane;
import Model.GerenciadorDeTarefas;
public class AcoesTarefa {
    public static void adicionarTarefa(GerenciadorDeTarefas gerenciador) {
        String descricao = JOptionPane.showInputDialog("Digite a descricao da tarefa:");
        if (descricao != null && !descricao.trim().isEmpty()) {
            gerenciador.adicionarTarefa(descricao.trim());
            JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Descrição invalida!");
        }
    }

    public static void marcarTarefaComoConcluida(GerenciadorDeTarefas gerenciador) {
        String listaTarefas = construirListaDeTarefas(gerenciador, false);
        if (listaTarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa disponivel!");
            return;
        }

        String entrada = JOptionPane.showInputDialog("Selecione o numero da tarefa para marcar como concluida:\n\n" + listaTarefas);
        try {
            int indice = Integer.parseInt(entrada) - 1;
            if (gerenciador.marcarTarefaComoConcluida(indice)) {
                JOptionPane.showMessageDialog(null, "Tarefa marcada como concluida!");
            } else {
                JOptionPane.showMessageDialog(null, "Tarefa invalida!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada invalida!");
        }
    }

    public static void removerTarefa(GerenciadorDeTarefas gerenciador) {
        String listaTarefas = construirListaDeTarefas(gerenciador, false);
        if (listaTarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa disponivel!");
            return;
        }

        String entrada = JOptionPane.showInputDialog("Selecione o número da tarefa para remover:\n\n" + listaTarefas);
        try {
            int indice = Integer.parseInt(entrada) - 1;
            if (gerenciador.removerTarefa(indice)) {
                JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Tarefa invalida!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada invalida!");
        }
    }

    public static void exibirTarefas(GerenciadorDeTarefas gerenciador) {
        String listaTarefas = construirListaDeTarefas(gerenciador, true);
        if (listaTarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa cadastrada!");
        } else {
            JOptionPane.showMessageDialog(null, "Tarefas:\n\n" + listaTarefas);
        }
    }

    private static String construirListaDeTarefas(GerenciadorDeTarefas gerenciador, boolean exibirTodas) {
        StringBuilder listaTarefas = new StringBuilder();
        int indice = 1;
        for (Tarefa tarefa : gerenciador.getTarefas()) {
            if (exibirTodas || !tarefa.isConcluida()) {
                listaTarefas.append(indice).append(". ").append(tarefa).append("\n");
            }
            indice++;
        }
        return listaTarefas.toString();
    }
}
