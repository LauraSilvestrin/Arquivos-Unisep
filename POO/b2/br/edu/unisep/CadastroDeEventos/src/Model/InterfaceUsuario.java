package Model;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class InterfaceUsuario {
    private GerenciadorDeEventos gerenciador;

    public InterfaceUsuario() {
        gerenciador = new GerenciadorDeEventos();
    }

    public void exibirMenu() {
        while (true) {
            String[] opcoes = {"Cadastrar Evento", "Listar Eventos", "Editar Evento", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Menu Principal", "Cadastro de Eventos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0 -> exibirTelaCadastro();
                case 1 -> exibirTelaListagem();
                case 2 -> exibirTelaEdicao();
                case 3 -> System.exit(0);
            }
        }
    }

    private void exibirTelaCadastro() {
        JPanel painel = criarFormulario(null);
        int resultado = JOptionPane.showConfirmDialog(null, painel, "Cadastrar Evento",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (resultado == JOptionPane.OK_OPTION) {
            Evento evento = obterEventoDoFormulario(painel);
            gerenciador.adicionarEvento(evento);
            JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso!");
        }
    }

    private void exibirTelaListagem() {
        List<Evento> eventos = gerenciador.getEventos();
        if (eventos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum evento cadastrado.");
        } else {
            StringBuilder lista = new StringBuilder();
            for (int i = 0; i < eventos.size(); i++) {
                lista.append("Evento ").append(i + 1).append(":\n");
                lista.append("Nome: ").append(eventos.get(i).getNome()).append("\n");
                lista.append("Local: ").append(eventos.get(i).getLocal()).append("\n");
                lista.append("Data: ").append(eventos.get(i).getData()).append("\n");
                lista.append("Horário: ").append(eventos.get(i).getHorario()).append("\n");
                lista.append("Descrição: ").append(eventos.get(i).getDescricao()).append("\n");
                lista.append("------------------------------\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString(), "Eventos Cadastrados",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }


    private void exibirTelaEdicao() {
        List<Evento> eventos = gerenciador.getEventos();
        if (eventos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum evento para editar.");
            return;
        }

        String[] nomesEventos = eventos.stream().map(Evento::getNome).toArray(String[]::new);
        String eventoSelecionado = (String) JOptionPane.showInputDialog(null, "Selecione um evento para editar:",
                "Editar Evento", JOptionPane.PLAIN_MESSAGE, null, nomesEventos, nomesEventos[0]);

        if (eventoSelecionado != null) {
            int index = -1;
            for (int i = 0; i < eventos.size(); i++) {
                if (eventos.get(i).getNome().equals(eventoSelecionado)) {
                    index = i;
                    break;
                }
            }

            if (index >= 0) {
                Evento eventoAtual = eventos.get(index);
                JPanel painel = criarFormulario(eventoAtual);
                int resultado = JOptionPane.showConfirmDialog(null, painel, "Editar Evento",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (resultado == JOptionPane.OK_OPTION) {
                    Evento eventoAtualizado = obterEventoDoFormulario(painel);
                    gerenciador.editarEvento(index, eventoAtualizado);
                    JOptionPane.showMessageDialog(null, "Evento atualizado com sucesso!");
                }
            }
        }
    }

    private JPanel criarFormulario(Evento evento) {
        JPanel painel = new JPanel(new GridLayout(5, 2));
        JTextField campoNome = new JTextField(evento != null ? evento.getNome() : "");
        JTextField campoLocal = new JTextField(evento != null ? evento.getLocal() : "");
        JTextField campoData = new JTextField(evento != null ? evento.getData() : "");
        JTextField campoHorario = new JTextField(evento != null ? evento.getHorario() : "");
        JTextField campoDescricao = new JTextField(evento != null ? evento.getDescricao() : "");

        painel.add(new JLabel("Nome:"));
        painel.add(campoNome);
        painel.add(new JLabel("Local:"));
        painel.add(campoLocal);
        painel.add(new JLabel("Data:"));
        painel.add(campoData);
        painel.add(new JLabel("Horário:"));
        painel.add(campoHorario);
        painel.add(new JLabel("Descrição:"));
        painel.add(campoDescricao);

        painel.putClientProperty("campos", new JTextField[]{campoNome, campoLocal, campoData, campoHorario, campoDescricao});
        return painel;
    }

    private Evento obterEventoDoFormulario(JPanel painel) {
        JTextField[] campos = (JTextField[]) painel.getClientProperty("campos");
        return new Evento(campos[0].getText(), campos[1].getText(), campos[2].getText(), campos[3].getText(), campos[4].getText());
    }
}
