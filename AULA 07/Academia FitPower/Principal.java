public class Principal {

    public static void main(String[] args) {

        Academia academia = new Academia();

        // ==========================================
        // 1. CRIANDO MATRÍCULAS VÁLIDAS
        // ==========================================

        MatriculaMensal m1 =
                new MatriculaMensal("Ana", 100);

        MatriculaAnual m2 =
                new MatriculaAnual("Bruno", 200);

        MatriculaFamilia m3 =
                new MatriculaFamilia("Carla", 150, 2);

        // ==========================================
        // 2. ADICIONANDO NA ACADEMIA
        // ==========================================

        academia.adicionarMatricula(m1);
        academia.adicionarMatricula(m2);
        academia.adicionarMatricula(m3);

        // ==========================================
        // 3. MOSTRANDO AS MENSALIDADES
        // ==========================================

        System.out.println("===== MATRÍCULAS =====");

        System.out.println(
                m1.getNomeAluno() + " - R$ "
                + m1.calcularMensalidade()
        );

        System.out.println(
                m2.getNomeAluno() + " - R$ "
                + m2.calcularMensalidade()
        );

        System.out.println(
                m3.getNomeAluno() + " - R$ "
                + m3.calcularMensalidade()
        );

        // ==========================================
        // 4. TENTATIVA DE MENSALIDADE INVÁLIDA
        // ==========================================

        try {

            MatriculaMensal erro =
                    new MatriculaMensal("Pedro", 50);

        } catch (MensalidadeInvalidaException e) {

            System.out.println();
            System.out.println("ERRO:");
            System.out.println(e.getMessage());
        }

        // ==========================================
        // 5. TENTATIVA DE EXTRAS INVÁLIDOS
        // ==========================================

        try {

            MatriculaFamilia erro =
                    new MatriculaFamilia("João", 100, 5);

        } catch (IllegalArgumentException e) {

            System.out.println();
            System.out.println("ERRO:");
            System.out.println(e.getMessage());
        }

        // ==========================================
        // 6. REGISTRANDO CHECK-INS
        // ==========================================

        academia.registrarCheckin(1);
        academia.registrarCheckin(1);
        academia.registrarCheckin(1);

        academia.registrarCheckin(2);
        academia.registrarCheckin(2);

        academia.registrarCheckin(4);

        // ==========================================
        // 7. CHECK-IN INVÁLIDO
        // ==========================================

        try {

            academia.registrarCheckin(7);

        } catch (IllegalArgumentException e) {

            System.out.println();
            System.out.println("ERRO:");
            System.out.println(e.getMessage());
        }

        // ==========================================
        // 8. RELATÓRIO FINAL
        // ==========================================

        System.out.println();
        System.out.println("===== RELATÓRIO DO MÊS =====");

        System.out.println(
                "Receita mensal total: R$ "
                + academia.receitaMensalTotal()
        );

        Matricula maior = academia.matriculaMaisCara();

        System.out.println(
                "Matrícula mais cara: "
                + maior.getNomeAluno()
        );

        System.out.println(
                "Valor da matrícula mais cara: R$ "
                + maior.calcularMensalidade()
        );

        System.out.println(
                "Dia mais movimentado: "
                + academia.diaMaisMovimentado()
        );
    }
}