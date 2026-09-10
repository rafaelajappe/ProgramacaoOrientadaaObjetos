public class Principal {

public static void main(String[] args) {

    Banco banco = new Banco();

    Titular titular1 = new Titular("Augusto");
    Titular titular2 = new Titular("Maria");

    int conta1 = banco.abrirConta(titular1);
    int conta2 = banco.abrirConta(titular2);

    System.out.println();

    banco.depositar(conta1, 500);
    banco.depositar(conta2, 300);

    System.out.println();

    banco.consultar(conta1);
    banco.consultar(conta2);

    System.out.println();

    banco.sacar(conta1, 100);

    System.out.println();

    banco.transferir(conta1, conta2, 200);

    System.out.println();

    banco.consultar(conta1);
    banco.consultar(conta2);

    System.out.println();

    banco.consultar(99);

    banco.transferir(conta1, conta1, 50);
}

}

