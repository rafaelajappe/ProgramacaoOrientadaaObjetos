// ContaUniversitaria é uma ContaBancaria
public class ContaUniversitaria extends ContaBancaria {

    ContaUniversitaria(Titular titular) {
        super(titular);
    }

    @Override
    void sacar(double valor) {

        if (valor > 300) {

            System.out.println("Conta universitária de "
                    + getTitular().getNome()
                    + ": saque máximo de R$ 300"
                    + " (pedido: R$ " + valor + ")");

        } else {

            super.sacar(valor);
        }
    }
}
