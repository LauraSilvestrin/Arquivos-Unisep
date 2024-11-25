package Model;

import java.util.ArrayList;
import Model.*;

public class GerenciadorDeTarefas {
    private final ArrayList<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public boolean marcarTarefaComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).setConcluida(true);
            return true;
        }
        return false;
    }

    public boolean removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            return true;
        }
        return false;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }
}
