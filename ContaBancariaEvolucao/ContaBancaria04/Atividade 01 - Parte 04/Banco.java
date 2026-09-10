import java.util.ArrayList;

public class Banco {

private ArrayList<ContaBancaria> contas = new ArrayList<>();
private int proximoNumero = 1;

public int abrirConta(Titular titular) {

    ContaBancaria conta = new ContaBancaria(titular, 0);

    contas.add(conta);

    int numero = proximoNumero;
    proximoNumero++;

    System.out.println("Conta criada com sucesso!");
    System.out.println("Número da conta: " + numero);

    return numero;
}

public ContaBancaria buscarConta(int numero) {

    if (numero < 1 || numero > contas.size()) {
        System.out.println("Conta inexistente.");
        return null;
    }

    return contas.get(numero - 1);
}

public void sacar(int numero, double valor) {

    ContaBancaria conta = buscarConta(numero);

    if (conta != null) {
        conta.sacar(valor);
    }
}

public void depositar(int numero, double valor) {

    ContaBancaria conta = buscarConta(numero);

    if (conta != null) {
        conta.depositar(valor);
    }
}

public void transferir(int origem, int destino, double valor) {

    if (origem == destino) {
        System.out.println("A conta de origem e destino não podem ser iguais.");
        return;
    }

    ContaBancaria contaOrigem = buscarConta(origem);
    ContaBancaria contaDestino = buscarConta(destino);

    if (contaOrigem == null || contaDestino == null) {
        return;
    }

    double saldoAntes = contaOrigem.getSaldo();

    boolean saqueRealizado = contaOrigem.sacar(valor);

    if (saqueRealizado) {
        contaDestino.depositar(valor);

        System.out.println("Transferência realizada com sucesso.");
    }
}

public void consultarSaldo(int numero) {

    ContaBancaria conta = buscarConta(numero);

    if (conta != null) {

        System.out.println("\n--- SALDO ---");
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}

public void exibirExtrato(int numero) {

    ContaBancaria conta = buscarConta(numero);

    if (conta != null) {

        System.out.println("\nConta: " + numero);
        System.out.println("Titular: " + conta.getTitular().getNome());

        conta.exibirExtrato();
    }
}

public void aplicarRendimento(int numero, double percentual) {

    ContaBancaria conta = buscarConta(numero);

    if (conta != null) {
        conta.render(percentual);
    }
}

public void listarContas() {

    System.out.println("\n--- CONTAS DO BANCO ---");

    if (contas.size() == 0) {
        System.out.println("Nenhuma conta cadastrada.");
        return;
    }

    for (int i = 0; i < contas.size(); i++) {

        ContaBancaria conta = contas.get(i);

        System.out.println(
                "Conta: " + (i + 1)
                + " | Titular: " + conta.getTitular().getNome()
                + " | Saldo: R$ " + conta.getSaldo()
        );
    }
}

}

