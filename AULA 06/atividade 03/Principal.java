public class Principal {

    public static void main(String[] args) {

        Locadora locadora = new Locadora();

        Carro carro1 =
                new Carro("ABC1234", "Onix", 100);

        Carro carro2 =
                new Carro("DEF5678", "HB20", 120);

        Moto moto1 =
                new Moto("GHI9012", "CG 160", 50);

        Moto moto2 =
                new Moto("JKL3456", "Biz", 40);

        locadora.adicionarVeiculo(carro1);
        locadora.adicionarVeiculo(carro2);
        locadora.adicionarVeiculo(moto1);
        locadora.adicionarVeiculo(moto2);

        System.out.println("--- Aluguéis ---");

        locadora.alugar("ABC1234", 3);

        locadora.alugar("GHI9012", 5);

        locadora.alugar("JKL3456", 10);

        locadora.alugar("XXX9999", 2);

        locadora.alugar("DEF5678", 0);

        System.out.println();

        System.out.println(
            "Faturamento: R$ " + locadora.getFaturamento()
        );
    }
}
