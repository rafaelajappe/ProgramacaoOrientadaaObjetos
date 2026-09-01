public class Principal {

public static void main(String[] args) {

    Titular titular = new Titular("Augusto");

    ContaBancaria c1 = new ContaBancaria(titular, -100);

    System.out.println("Saldo inicial: R$ " + c1.getSaldo());

    c1.depositar(500);
    c1.sacar(100);
    c1.render(10);

    System.out.println("Conta de " + c1.getTitular().getNome()
            + ": R$ " + c1.getSaldo()
            + " em " + c1.getOperacoes().size() + " movimentações");

    System.out.println("Titular: " + c1.getTitular().getNome());

    c1.exibirExtrato();

    System.out.println("\nTotal depositado: R$ " + c1.totalDepositado());

    System.out.println("Maior saque: R$ " + c1.maiorSaque());
}


}
