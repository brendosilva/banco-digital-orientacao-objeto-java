package br.dio;

public class ContaPoupanca extends Conta {



    @Override
    public void informacoes() {
        System.out.println("====== conta poupança ========");
        System.out.println("Agência: "+ super.getAgencia());
        System.out.println("Conta: "+ super.getNumeroConta());
        System.out.println("Saldo: "+ super.getSaldo());
    }
}
