package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeEventos {
    private List<Evento> eventos;
    private final String caminhoArquivo = "eventos.txt";

    public GerenciadorDeEventos() {
        this.eventos = new ArrayList<>();
        carregarEventos();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
        salvarEventos();
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void editarEvento(int index, Evento eventoAtualizado) {
        if (index >= 0 && index < eventos.size()) {
            eventos.set(index, eventoAtualizado);
            salvarEventos();
        }
    }

    public void carregarEventos() {
        eventos.clear();
        File arquivo = new File(caminhoArquivo);
        if (arquivo.exists()) {
            try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = leitor.readLine()) != null) {
                    eventos.add(Evento.fromString(linha));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void salvarEventos() {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Evento evento : eventos) {
                escritor.write(evento.toString());
                escritor.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}