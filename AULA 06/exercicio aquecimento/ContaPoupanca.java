public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(Titular titular, int numero) {
        super(titular, numero);
    }

    public void aplicarRendimento(double percentual) {
        if (percentual > 0) {
            saldo = saldo + saldo * percentual / 100;
        }
    }
}