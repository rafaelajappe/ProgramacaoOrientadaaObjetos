public class Principal {

    public static void main(String[] args) {

        // Criando 2 contas
        ContaBancaria conta1 = new ContaBancaria("Rafaela", 1000.00);

        ContaBancaria conta2 = new ContaBancaria("João", 500.00);


        // Movimentações da conta 1
        conta1.depositar(200.00);

        conta1.sacar(300.00);


        // Movimentações da conta 2
        conta2.depositar(100.00);

        conta2.sacar(200.00);


        // Transferência da conta 1 para conta 2
        conta1.transferir(conta2, 150.00);


        // Exibindo os saldos finais
        System.out.println("SALDOS FINAIS");

        conta1.exibirSaldo();

        conta2.exibirSaldo();
    }
}