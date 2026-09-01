import java.util.ArrayList;

public class Banco {

private ArrayList<ContaBancaria> contas = new ArrayList<>();
private int proximoNumero = 1;

public int abrirConta(Titular titular) {

    ContaBancaria conta = new ContaBancaria(titular, 0);

    contas.add(conta);

    int numero = proximoNumero;

    proximoNumero++;

    System.out.println("Conta aberta com sucesso.");
    System.out.println("Número da conta: " + numero);
    System.out.println("Titular: " + titular.getNome());

    return numero;
}

public ContaBancaria buscarConta(int numero) {

    if (numero < 1 || numero > contas.size()) {
        System.out.println("Conta " + numero + " não encontrada.");
        return null;
    }

    return contas.get(numero - 1);
}

public void depositar(int numero, double valor) {

    ContaBancaria conta = buscarConta(numero);

    if (conta != null) {
        conta.depositar(valor);
    }
}

public void sacar(int numero, double valor) {

    ContaBancaria conta = buscarConta(numero);

    if (conta != null) {
        conta.sacar(valor);
    }
}

public void consultar(int numero) {

    ContaBancaria conta = buscarConta(numero);

    if (conta != null) {
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}

public void transferir(int origem, int destino, double valor) {

    if (origem == destino) {
        System.out.println("Não é possível transferir para a mesma conta.");
        return;
    }

    ContaBancaria contaOrigem = buscarConta(origem);
    ContaBancaria contaDestino = buscarConta(destino);

    if (contaOrigem != null && contaDestino != null) {

        double saldoAntes = contaOrigem.getSaldo();

        contaOrigem.sacar(valor);

        if (contaOrigem.getSaldo() < saldoAntes) {

            contaDestino.depositar(valor);

            System.out.println("Transferência realizada com sucesso.");
        }
    }
}

}

