import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ContaCorrente corrente = new ContaCorrente(
                new Titular("Maria", "111.222.333-44", "01/01/2000"));

        ContaPoupanca poupanca = new ContaPoupanca(
                new Titular("João", "555.666.777-88", "02/02/1999"));

        ContaUniversitaria uni = new ContaUniversitaria(
                new Titular("Ana", "999.888.777-66", "03/03/2005"));


        // Depositando R$ 500 em cada conta

        corrente.depositar(500.0);
        poupanca.depositar(500.0);
        uni.depositar(500.0);


        // Corrente cobra tarifa
        corrente.sacar(100.0);

        // Poupança não cobra tarifa
        poupanca.sacar(100.0);

        // Universitária não permite mais de R$ 300
        uni.sacar(400.0);


        // Somente a poupança possui rendimento
        poupanca.aplicarRendimento(10.0);


        // Lista que aceita todas as contas da família

        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(corrente);
        contas.add(poupanca);
        contas.add(uni);


        // Desafio: sacar R$ 50 de todas

        System.out.println("--- Saque de R$ 50 em todas ---");

        for (ContaBancaria c : contas) {

            c.sacar(50.0);
        }


        // Mostrar saldos finais

        System.out.println("--- Saldos finais ---");

        for (ContaBancaria c : contas) {

            c.exibirSaldo();
        }
    }
}
