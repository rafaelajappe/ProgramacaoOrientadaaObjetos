// ContaCorrente é uma ContaBancaria
public class ContaCorrente extends ContaBancaria {

    ContaCorrente(Titular titular) {
        super(titular);
    }

    @Override
    void sacar(double valor) {

        if (valor <= 0) {

            System.out.println("Saque inválido na conta de "
                    + getTitular().getNome()
                    + ": R$ " + valor);

            return;
        }

        double custo = valor + 0.50;

        if (custo > saldo) {

            System.out.println("Saldo insuficiente na conta de "
                    + getTitular().getNome()
                    + ": saque R$ " + valor
                    + " mais tarifa, saldo R$ " + saldo);

        } else {

            saldo = saldo - custo;

            movimentacoes.add(valor * -1);

            System.out.println("Saque de R$ " + valor
                    + " (tarifa R$ 0.50) na conta de "
                    + getTitular().getNome());
        }
    }
}