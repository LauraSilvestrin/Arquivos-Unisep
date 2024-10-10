package br.edu.unisep.veiculos.Model;

public abstract class Veiculo{
    public String placa;
    public String cor;

    public Veiculo(String placa, String cor, String marca) {
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
    }

    public String marca;

    public void acelerar(){

    }

    public void freiar(){

    }

    public abstract void exibirDetalhes();
}
