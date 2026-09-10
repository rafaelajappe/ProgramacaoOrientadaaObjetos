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

public boolean depositar(double valor) {

    if (valor <= 0) {
        System.out.println("Valor de depósito inválido.");
        return false;
    }

    saldo += valor;
    movimentacoes.add(valor);

    System.out.println("Depósito de R$ " + valor + " realizado.");
    return true;
}

public boolean sacar(double valor) {

    double tarifa = 0.5;

    if (valor <= 0) {
        System.out.println("Valor de saque inválido.");
        return false;
    }

    if (valor + tarifa > saldo) {
        System.out.println("Saldo insuficiente.");
        return false;
    }

    saldo -= valor + tarifa;
    movimentacoes.add(-valor);

    System.out.println("Saque de R$ " + valor
            + " realizado. Tarifa: R$ " + tarifa);

    return true;
}

public void render(double percentual) {

    if (percentual <= 0) {
        System.out.println("Percentual inválido.");
        return;
    }

    double rendimento = saldo * percentual / 100;
    saldo += rendimento;

    System.out.println("Rendimento de " + percentual
            + "% aplicado.");
    System.out.println("Valor do rendimento: R$ " + rendimento);
}

public void exibirExtrato() {

    System.out.println("\n--- EXTRATO ---");

    if (movimentacoes.size() == 0) {
        System.out.println("Nenhuma movimentação.");
        return;
    }

    for (Double movimentacao : movimentacoes) {

        if (movimentacao > 0) {
            System.out.println("Depósito: +R$ " + movimentacao);
        } else {
            System.out.println("Saque: R$ " + movimentacao);
        }
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

