package br.edu.unisep.veiculos.Model;

import java.sql.SQLOutput;

public class Moto extends Veiculo {

    public Moto(String placa, String cor, String marca, int cilindrada, boolean temBau) {
        super(placa, cor, marca);
        this.cilindrada = cilindrada;
        this.temBau = temBau;
    }

    public int cilindrada;
    public boolean temBau;

    @Override
    public void exibirDetalhes() {
        System.out.println("***************************");
        System.out.println("***********moto***********");
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        String possuiBau = (true)? "Possui bau: sim" : "Possui bau: nao";
        System.out.println(possuiBau);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("***************************");
    }

    public void abrirBau() {
        System.out.println("Bau aberto!");
    }
    public void fecharBau(){
        System.out.println("Bau fechado!");
    }
}
