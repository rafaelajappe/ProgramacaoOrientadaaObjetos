// ContaPoupanca é uma ContaBancaria
public class ContaPoupanca extends ContaBancaria {

    ContaPoupanca(Titular titular) {
        super(titular);
    }

    void aplicarRendimento(double percentual) {

        if (percentual < 0 || percentual > 100) {

            System.out.println("Percentual inválido: "
                    + percentual);

        } else {

            saldo = saldo + saldo * percentual / 100;

            System.out.println("Rendimento de "
                    + percentual
                    + "% na conta de "
                    + getTitular().getNome());
        }
    }
}