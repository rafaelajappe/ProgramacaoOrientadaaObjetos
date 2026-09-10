public class ContaBancaria {

    String titular;
    double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldo) {

        this.titular = titular;
        this.saldo = saldo;
    }

    // Depositar dinheiro
    public void depositar(double valor) {

        saldo = saldo + valor;

        System.out.println("Depósito realizado com sucesso!");
    }

    // Sacar dinheiro
    public void sacar(double valor) {

        if (valor <= saldo) {

            saldo = saldo - valor;

            System.out.println("Saque realizado com sucesso!");

        } else {

            System.out.println("Saldo insuficiente. Saque não realizado.");
        }
    }

    // Exibir saldo
    public void exibirSaldo() {

        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("--------------------");
    }

    // Transferir dinheiro
    public void transferir(ContaBancaria destino, double valor) {

        if (valor <= saldo) {

            sacar(valor);
            destino.depositar(valor);

            System.out.println("Transferência realizada com sucesso!");

        } else {

            System.out.println("Saldo insuficiente. Transferência não realizada.");
        }
    }
}