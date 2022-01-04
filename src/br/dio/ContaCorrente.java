package br.dio;

public class ContaCorrente extends Conta {

    @Override
    public void informacoes() {
        System.out.println("====== conta corrente ========");
        System.out.println("Agência: "+ super.getAgencia());
        System.out.println("Conta: "+ super.getNumeroConta());
        System.out.println("Saldo: "+ super.getSaldo());
    }
}
