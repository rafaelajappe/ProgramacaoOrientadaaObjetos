public class Principal {

    public static void main(String[] args) {

        Titular titular1 = new Titular("Rafaela", "12345", null);
        ContaBancaria c1 = new ContaBancaria(titular1, 500);

        c1.depositar(500.0);
        c1.depositar(-50.0);
        c1.sacar(100.0);
        c1.aplicarRendimento(10.0);
        c1.aplicarRendimento(150.0);

        c1.exibirSaldo();

        System.out.println(c1.titular.nome);
    }
}