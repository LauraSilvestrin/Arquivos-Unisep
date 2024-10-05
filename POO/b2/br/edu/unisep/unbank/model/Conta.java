package br.edu.unisep.unbank.model;

public abstract class Conta {
    protected String titular;
    protected double saldo;

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);
    public void Depositar(double valor){
        System.out.println("Depositou " + valor+ " reais");
        System.out.println("Saldo: " + valor);
        saldo += valor;
    }
}
