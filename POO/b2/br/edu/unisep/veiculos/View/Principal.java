package br.edu.unisep.veiculos.View;

import br.edu.unisep.unbank.model.ContaPoupanca;
import br.edu.unisep.unbank.model.Frota;
import br.edu.unisep.veiculos.Model.*;

public class Principal {
    public static void main(String[] args) {

        Frota frota = new Frota();

        Veiculo caminhao = new Caminhao("ABC1D23", "Branco", "Scania", 600, 12);
        caminhao.exibirDetalhes();
        ((Caminhao)caminhao).carregar();
        ((Caminhao)caminhao).descarregar();


        Veiculo carro = new Carro("ABC4D56", "vermelho", "Volkswagen", 5, "gasolina");
        carro.exibirDetalhes();
        ((Carro)carro).abrirPortaMalas();
        ((Carro)carro).fecharPortaMalas();


        Veiculo moto = new Moto("ABC7D89", "preto", "Yamaha", 160, true);
        moto.exibirDetalhes();
        ((Moto)moto).abrirBau();
        ((Moto)moto).fecharBau();

        frota.adicionarVeiculo(caminhao);
        frota.adicionarVeiculo(carro);
        frota.adicionarVeiculo(moto);

        System.out.println("____ Exibir frota ____");
        frota.exibirDetalhes();
    }
}
