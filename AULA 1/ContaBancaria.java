#exercicio 3

public class ContaBancaria {

    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    // Método para sacar
    public void sacar(double valor) {

        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque não realizado! Saldo insuficiente.");
        }
    }

    // Método para exibir o saldo
    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("----------------------");
    }

    // Método para transferir
    public void transferir(ContaBancaria destino, double valor) {

        if (valor <= saldo) {
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência não realizada! Saldo insuficiente.");
        }
    }
}
