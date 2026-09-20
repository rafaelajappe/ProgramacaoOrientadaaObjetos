public class Principal {

    public static void main(String[] args) {

        FolhaPagamento folha = new FolhaPagamento();

        Funcionario funcionario =
                new Funcionario("Carlos", 2000.0);

        Gerente gerente =
                new Gerente("Maria", 4000.0, 1000.0);

        Estagiario estagiario =
                new Estagiario("João", 2000.0, 20);


        folha.contratar(funcionario);
        folha.contratar(gerente);
        folha.contratar(estagiario);


        double total = folha.fecharFolha();

        System.out.println("Total da folha: R$ " + total);


        System.out.println("--- Aumento geral de 10% ---");

        folha.aumentoGeral(10);


        System.out.println("--- Folha após aumento ---");

        total = folha.fecharFolha();

        System.out.println("Total da folha: R$ " + total);
    }
}
