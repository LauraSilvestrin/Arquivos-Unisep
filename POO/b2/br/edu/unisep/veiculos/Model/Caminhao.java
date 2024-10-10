package br.edu.unisep.veiculos.Model;

public class Caminhao extends Veiculo {

    public int capacidadeDeCarga;

    public int numeroDeEixos;

    public Caminhao(String placa, String cor, String marca, int capacidadeDeCarga, int numeroDeEixos) {
        super(placa, cor, marca);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.numeroDeEixos = numeroDeEixos;
    }

    public void exibirDetalhes() {
        System.out.println("***************************");
        System.out.println("*********caminhao*********");
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Cap. de carga: " + capacidadeDeCarga + " toneladas");
        System.out.println("Numero de eixos: " + numeroDeEixos);
        System.out.println("***************************");
    }

    public void carregar(){
        System.out.println("Caminhao sendo carregado...");
    }
    public void descarregar(){
        System.out.println("Caminhao sendo descarregado...");
    }
}
