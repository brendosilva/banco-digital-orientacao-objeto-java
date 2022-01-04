package br.dio;

import br.dio.interfaces.IConta;

public abstract class Conta implements IConta {
    private static int AGENCIA = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA;
        this.numeroConta = Conta.SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferencia(double valor, Conta contaDestino) {
        if (this.saldo < valor) return;
        this.sacar(valor);
        contaDestino.depositar(valor);
    }



}
