public class Principal {
    public static void main(String[] args) {

        Titular titular1 = new Titular("Rafaela", "123.456.789-00");
        Titular titular2 = new Titular("Maria", "987.654.321-00");

        ContaCorrente corrente = new ContaCorrente(titular1, 1);
        ContaPoupanca poupanca = new ContaPoupanca(titular2, 2);

        corrente.depositar(100);
        poupanca.depositar(100);

        corrente.sacar(20);
        poupanca.sacar(20);

        System.out.println("Conta Corrente:");
        corrente.exibirSaldo();

        System.out.println();

        System.out.println("Conta Poupança:");
        poupanca.exibirSaldo();

        poupanca.aplicarRendimento(10);

        System.out.println("Poupança após rendimento:");
        poupanca.exibirSaldo();
    }
}