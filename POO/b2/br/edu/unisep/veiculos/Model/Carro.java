package br.edu.unisep.veiculos.Model;

public class Carro extends Veiculo {


    public int capacidadePassageiros;

    public String tipoCombustivel;

    public Carro(String placa, String cor, String marca, int capacidadePassageiros, String tipoCombustivel) {
        super(placa, cor, marca);
        this.capacidadePassageiros = capacidadePassageiros;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("***************************");
        System.out.println("**********Carro***********");
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Cap. passageiros: " + capacidadePassageiros);
        System.out.println("Tipo de combustivel: " + tipoCombustivel);
        System.out.println("***************************");
    }

    public void abrirPortaMalas() {
        System.out.println("Porta malas aberto!");
    }

    public void fecharPortaMalas() {
        System.out.println("Porta malas fechado!");
    }
}
