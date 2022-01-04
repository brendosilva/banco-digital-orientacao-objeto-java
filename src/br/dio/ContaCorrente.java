package br.dio;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void informacoes() {
        System.out.println("====== conta corrente ========");
        System.out.println("Cliente: "+ super.cliente.getNome());
        System.out.println("Agência: "+ super.getAgencia());
        System.out.println("Conta: "+ super.getNumeroConta());
        System.out.println("Saldo: "+ super.getSaldo());
    }
}
