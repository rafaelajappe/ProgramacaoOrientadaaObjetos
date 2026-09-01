import java.util.ArrayList;

public class ContaBancaria {

private Titular titular;
private double saldo;
private ArrayList<Double> movimentacoes = new ArrayList<>();

public ContaBancaria(Titular titular, double saldoInicial) {

    this.titular = titular;

    if (saldoInicial < 0) {
        System.out.println("Saldo inicial inválido. A conta começará com R$ 0.00");
        this.saldo = 0;
    } else {
        this.saldo = saldoInicial;
    }
}

public Titular getTitular() {
    return titular;
}

public double getSaldo() {
    return saldo;
}

public ArrayList<Double> getOperacoes() {
    return movimentacoes;
}

public void setTitular(String novo) {

    if (novo == null || novo.trim().isEmpty()) {
        System.out.println("Titular inválido.");
    } else {
        titular.setNome(novo);
    }
}

public void depositar(double valor) {

    if (valor > 0) {
        saldo += valor;
        movimentacoes.add(valor);

        System.out.println("Depósito de R$ " + valor + " na conta de "
                + titular.getNome());
    }
}

public void sacar(double valor) {

    double tarifa = 0.5;

    if (valor > 0 && valor + tarifa <= saldo) {

        saldo -= valor + tarifa;
        movimentacoes.add(-valor);

        System.out.println("Saque de R$ " + valor
                + " (tarifa R$ " + tarifa + ") na conta de "
                + titular.getNome());
    } else {
        System.out.println("Saque não realizado.");
    }
}

public void render(double percentual) {

    double rendimento = saldo * percentual / 100;
    saldo += rendimento;

    System.out.println("Rendimento de " + percentual
            + "% na conta de " + titular.getNome());
}

public void exibirExtrato() {

    System.out.println("\n--- EXTRATO ---");

    for (Double movimentacao : movimentacoes) {
        System.out.println("Movimentação: R$ " + movimentacao);
    }
}

public double totalDepositado() {

    double total = 0;

    for (Double movimentacao : movimentacoes) {

        if (movimentacao > 0) {
            total += movimentacao;
        }
    }

    return total;
}

public double maiorSaque() {

    double maior = 0;

    for (Double movimentacao : movimentacoes) {

        if (movimentacao < 0) {

            double saque = -movimentacao;

            if (saque > maior) {
                maior = saque;
            }
        }
    }

    return maior;
}

}
