public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(Titular titular, int numero) {
        super(titular, numero);
    }

    @Override
    public void sacar(double valor) {
        double tarifa = 0.50;

        if (valor > 0 && valor + tarifa <= saldo) {
            saldo = saldo - valor - tarifa;
        }
    }
}