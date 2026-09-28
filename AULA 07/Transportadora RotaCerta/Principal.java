public class Principal {

    public static void main(String[] args) {

        Central central = new Central();

        // ==========================================
        // 1. ENCOMENDAS VÁLIDAS
        // ==========================================

        EncomendaNormal e1 =
                new EncomendaNormal(
                        "N001",
                        "Ana",
                        5
                );

        EncomendaExpressa e2 =
                new EncomendaExpressa(
                        "E001",
                        "Bruno",
                        8
                );

        EncomendaFragil e3 =
                new EncomendaFragil(
                        "F001",
                        "Carla",
                        12
                );

        central.adicionarEncomenda(e1);
        central.adicionarEncomenda(e2);
        central.adicionarEncomenda(e3);

        // ==========================================
        // 2. EXPRESSA PESADA DEMAIS
        // ==========================================

        try {

            EncomendaExpressa erro =
                    new EncomendaExpressa(
                            "E002",
                            "Daniel",
                            15
                    );

            central.adicionarEncomenda(erro);

        } catch (PesoExpressaInvalidoException e) {

            System.out.println(
                    "EXCEÇÃO: "
                    + e.getClass().getSimpleName()
                    + " - "
                    + e.getMessage()
            );
        }

        // ==========================================
        // 3. CÓDIGO REPETIDO
        // ==========================================

        try {

            EncomendaNormal repetida =
                    new EncomendaNormal(
                            "N001",
                            "Eduarda",
                            3
                    );

            central.adicionarEncomenda(repetida);

        } catch (CodigoRepetidoException e) {

            System.out.println(
                    "EXCEÇÃO: "
                    + e.getClass().getSimpleName()
                    + " - "
                    + e.getMessage()
            );
        }

        // ==========================================
        // 4. PESO INVÁLIDO
        // ==========================================

        try {

            EncomendaNormal invalida =
                    new EncomendaNormal(
                            "N002",
                            "Felipe",
                            0
                    );

            central.adicionarEncomenda(invalida);

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "EXCEÇÃO: "
                    + e.getClass().getSimpleName()
                    + " - "
                    + e.getMessage()
            );
        }

        // ==========================================
        // 5. ENTREGA VÁLIDA
        // ==========================================

        try {

            central.entregar("E001");

        } catch (CodigoNaoEncontradoException e) {

            System.out.println(
                    "EXCEÇÃO: "
                    + e.getClass().getSimpleName()
                    + " - "
                    + e.getMessage()
            );
        }

        // ==========================================
        // 6. ENTREGA DE CÓDIGO INEXISTENTE
        // ==========================================

        try {

            central.entregar("X999");

        } catch (CodigoNaoEncontradoException e) {

            System.out.println(
                    "EXCEÇÃO: "
                    + e.getClass().getSimpleName()
                    + " - "
                    + e.getMessage()
            );
        }

        // ==========================================
        // 7. RELATÓRIO FINAL
        // ==========================================

        System.out.println();
        System.out.println("===== RELATÓRIO DA CENTRAL =====");

        System.out.printf(
                "Frete total das pendentes: R$ %.2f%n",
                central.freteTotal()
        );

        Encomenda maior =
                central.encomendaMaisPesada();

        if (maior != null) {

            System.out.println(
                    "Encomenda mais pesada: "
                    + maior.getCodigo()
            );

            System.out.println(
                    "Destinatário: "
                    + maior.getDestinatario()
            );

            System.out.println(
                    "Peso: "
                    + maior.getPeso()
                    + " kg"
            );
        }

        System.out.println(
                "Quantidade de normais: "
                + central.quantidadeNormais()
        );

        System.out.println(
                "Quantidade de expressas: "
                + central.quantidadeExpressas()
        );

        System.out.println(
                "Quantidade de frágeis: "
                + central.quantidadeFrageis()
        );
    }
}