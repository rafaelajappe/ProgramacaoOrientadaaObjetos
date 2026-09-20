public class ContaBancaria {
    private Titular titular;
    private int numero;
    protected double saldo;

    public ContaBancaria(Titular titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}
