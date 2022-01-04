package br.dio;

public class ContaPoupanca extends Conta {

    private String name;
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        name = super.cliente.getNome();
    }

    @Override
    public void informacoes() {
        System.out.println("====== conta poupança ========");
        System.out.println("Cliente: "+ this.name);
        System.out.println("Agência: "+ super.getAgencia());
        System.out.println("Conta: "+ super.getNumeroConta());
        System.out.println("Saldo: "+ super.getSaldo());
    }
}
