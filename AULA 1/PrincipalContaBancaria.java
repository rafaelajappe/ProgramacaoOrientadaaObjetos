#exercicio 3

public class Principal {

    public static void main(String[] args) {

        // Criando duas contas
        ContaBancaria conta1 = new ContaBancaria("Rafaela", 1000.00);
        ContaBancaria conta2 = new ContaBancaria("Maria", 500.00);

        // Movimentando a primeira conta
        conta1.depositar(200.00);
        conta1.sacar(100.00);

        // Movimentando a segunda conta
        conta2.depositar(300.00);
        conta2.sacar(50.00);

        // Transferindo R$ 200 da conta 1 para a conta 2
        conta1.transferir(conta2, 200.00);

        // Exibindo os saldos
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
