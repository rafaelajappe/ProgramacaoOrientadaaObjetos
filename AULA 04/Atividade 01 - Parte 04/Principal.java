import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Banco banco = new Banco();

    int opcao = -1;

    while (opcao != 0) {

        System.out.println("\n============================");
        System.out.println("       BANCO - CAIXA");
        System.out.println("============================");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Transferir");
        System.out.println("5 - Consultar saldo");
        System.out.println("6 - Ver extrato");
        System.out.println("7 - Aplicar rendimento");
        System.out.println("8 - Listar contas");
        System.out.println("0 - Sair");
        System.out.println("============================");
        System.out.print("Escolha uma opção: ");

        try {

            opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1) {

                System.out.println("\n--- CRIAR CONTA ---");

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("CPF: ");
                String cpf = scanner.nextLine();

                System.out.print("Data de nascimento (DD.MM.AAAA): ");
                String data = scanner.nextLine();

                if (nome.trim().isEmpty()) {
                    System.out.println("Nome inválido.");
                    continue;
                }

                if (cpf.trim().isEmpty()) {
                    System.out.println("CPF inválido.");
                    continue;
                }

                DateTimeFormatter formato =
                        DateTimeFormatter.ofPattern("dd.MM.yyyy");

                LocalDate dataNascimento =
                        LocalDate.parse(data, formato);

                Titular titular = new Titular(
                        nome,
                        cpf,
                        dataNascimento
                );

                banco.abrirConta(titular);

            } else if (opcao == 2) {

                System.out.print("Número da conta: ");
                int numero = Integer.parseInt(scanner.nextLine());

                System.out.print("Valor do saque: ");
                double valor = Double.parseDouble(scanner.nextLine());

                banco.sacar(numero, valor);

            } else if (opcao == 3) {

                System.out.print("Número da conta: ");
                int numero = Integer.parseInt(scanner.nextLine());

                System.out.print("Valor do depósito: ");
                double valor = Double.parseDouble(scanner.nextLine());

                banco.depositar(numero, valor);

            } else if (opcao == 4) {

                System.out.print("Conta de origem: ");
                int origem = Integer.parseInt(scanner.nextLine());

                System.out.print("Conta de destino: ");
                int destino = Integer.parseInt(scanner.nextLine());

                System.out.print("Valor da transferência: ");
                double valor = Double.parseDouble(scanner.nextLine());

                banco.transferir(origem, destino, valor);

            } else if (opcao == 5) {

                System.out.print("Número da conta: ");
                int numero = Integer.parseInt(scanner.nextLine());

                banco.consultarSaldo(numero);

            } else if (opcao == 6) {

                System.out.print("Número da conta: ");
                int numero = Integer.parseInt(scanner.nextLine());

                banco.exibirExtrato(numero);

            } else if (opcao == 7) {

                System.out.print("Número da conta: ");
                int numero = Integer.parseInt(scanner.nextLine());

                System.out.print("Percentual de rendimento: ");
                double percentual = Double.parseDouble(scanner.nextLine());

                banco.aplicarRendimento(numero, percentual);

            } else if (opcao == 8) {

                banco.listarContas();

            } else if (opcao == 0 ) {

                System.out.println("Programa encerrado.");

            } else {

                System.out.println("Opção inválida.");
            }

        } catch (Exception e) {

            System.out.println("Dados inválidos. Tente novamente.");
            opcao = -1;
        }
    }

    scanner.close();
}

}
