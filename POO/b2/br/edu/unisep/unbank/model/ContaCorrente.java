package br.edu.unisep.unbank.model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if ((saldo + limite) >= valor) {
            saldo -= valor;
            System.out.println(titular + " sacou: " + valor);
            System.out.println("Saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
