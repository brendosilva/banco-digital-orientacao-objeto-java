package br.dio;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(1000);
        cc.sacar(50);

        cc.transferencia(500, cp);
        cp.transferencia(6000, cc);
        cp.transferencia(150, cc);

        cc.informacoes();
        cp.informacoes();
    }
}
