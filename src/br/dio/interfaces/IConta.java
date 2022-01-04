package br.dio.interfaces;

import br.dio.Conta;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferencia(double valor, Conta contaDestino);
    void informacoes();
}
