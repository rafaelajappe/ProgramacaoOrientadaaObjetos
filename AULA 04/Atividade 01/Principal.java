public class Principal {

    public static void main(String[] args) {

        Titular titular1 = new Titular("Augusto", "12345", null);

        ContaBancaria c1 = new ContaBancaria(titular1, -100);

        System.out.println("Saldo inicial: R$ " + c1.getSaldo());

        c1.depositar(500.0);

        c1.sacar(100.0);

        c1.aplicarRendimento(10.0);

        c1.exibirSaldo();

        System.out.println("Titular: " + c1.getTitular().getNome());
    }
}