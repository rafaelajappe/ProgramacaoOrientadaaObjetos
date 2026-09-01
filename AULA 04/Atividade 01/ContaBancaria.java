import java.util.ArrayList;

public class ContaBancaria {

    private Titular titular;
    private double saldo;
    private ArrayList<Double> movimentacoes = new ArrayList<>();

    ContaBancaria(Titular titular, double saldoInicial) {

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

    public void setTitular(Titular novo) {

        if (novo == null) {
            System.out.println("Titular inválido");
        } else {
            titular = novo;
        }
    }

    void exibirExtrato() {

        for (Double mov : movimentacoes) {
            System.out.println("Movimentação: " + mov);
        }
    }

    void mostrarTotalDepositado() {

        double valorTotal = 0.00;

        for (Double mov : movimentacoes) {

            if (mov > 0) {
                valorTotal += mov;
            }
        }

        System.out.println("Total Depositado: " + valorTotal);
    }

    void mostrarMaiorSaque() {

        if (movimentacoes.size() == 0) {
            System.out.println("Nenhum saque realizado.");
            return;
        }

        double maiorSaque = 0;

        for (Double mov : movimentacoes) {

            if (mov < 0 && mov < maiorSaque) {
                maiorSaque = mov;
            }
        }

        if (maiorSaque == 0) {
            System.out.println("Nenhum saque realizado.");
        } else {
            System.out.println("Maior Saque: " + (maiorSaque * -1));
        }
    }

    void depositar(double valor) {

        if (valor <= 0) {

            System.out.println("Depósito inválido na conta de "
                    + titular.getNome() + ": R$ " + valor);

        } else {

            saldo = saldo + valor;
            movimentacoes.add(valor);

            System.out.println("Depósito de R$ " + valor
                    + " na conta de " + titular.getNome());
        }
    }

    void sacar(double valor) {

        double custo = valor + 0.50;

        if (valor <= 0) {

            System.out.println("Saque inválido.");

        } else if (custo > saldo) {

            System.out.println("Saldo insuficiente na conta de "
                    + titular.getNome()
                    + ": saque R$ " + valor
                    + " mais tarifa, saldo R$ " + saldo);

        } else {

            saldo = saldo - custo;
            movimentacoes.add(valor * -1);

            System.out.println("Saque de R$ " + valor
                    + " (tarifa R$ 0.5) na conta de "
                    + titular.getNome());
        }
    }

    void aplicarRendimento(double percentual) {

        if (percentual < 0 || percentual > 100) {

            System.out.println("Percentual inválido: " + percentual);

        } else {

            saldo = saldo + saldo * percentual / 100;

            System.out.println("Rendimento de " + percentual
                    + "% na conta de " + titular.getNome());
        }
    }

    void exibirSaldo() {

        System.out.println("Conta de " + titular.getNome()
                + ": R$ " + saldo
                + " em " + movimentacoes.size()
                + " transações");
    }
}