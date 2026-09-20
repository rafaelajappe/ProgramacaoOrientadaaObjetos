import java.util.ArrayList;

// Conta genérica: sem tarifa e sem rendimento
public class ContaBancaria {

    private Titular titular;
    protected double saldo;
    protected ArrayList<Double> movimentacoes = new ArrayList<>();

    ContaBancaria(Titular titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public Titular getTitular() {
        return titular;
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

    // Saque genérico: sem tarifa
    void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Saque inválido na conta de "
                    + titular.getNome() + ": R$ " + valor);

        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente na conta de "
                    + titular.getNome()
                    + ": saque R$ " + valor
                    + ", saldo R$ " + saldo);

        } else {
            saldo = saldo - valor;
            movimentacoes.add(valor * -1);

            System.out.println("Saque de R$ " + valor
                    + " na conta de " + titular.getNome());
        }
    }

    void exibirExtrato() {

        System.out.println("Extrato de " + titular.getNome() + ":");

        for (Double mov : movimentacoes) {
            System.out.println("  Movimentacao: " + mov);
        }
    }

    void mostrarTotalDepositado() {

        Double valorTotal = 0.00;

        for (Double mov : movimentacoes) {

            if (mov > 0) {
                valorTotal += mov;
            }
        }

        System.out.println("Total Depositado: " + valorTotal);
    }

    void mostrarMaiorSaque() {

        if (movimentacoes.isEmpty()) {
            System.out.println("Maior Saque: nenhum");
            return;
        }

        Double maiorSaque = movimentacoes.get(0);

        for (Double mov : movimentacoes) {

            if (mov < maiorSaque) {
                maiorSaque = mov;
            }
        }

        System.out.println("Maior Saque: " + maiorSaque);
    }

    void exibirSaldo() {

        System.out.println("Conta de " + titular.getNome()
                + ": R$ " + saldo
                + " em " + movimentacoes.size()
                + " transações");
    }
}