public class Principal {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Rafaela", "99999-9999");

        Consulta consulta1 = new Consulta(
                paciente1,
                java.time.LocalDate.of(2026, 8, 20),
                150.00
        );

        consulta1.exibirComprovante();

        System.out.println();

        Paciente paciente2 = new Paciente("Augusto", "98888-8888");

        Consulta consulta2 = new Consulta(
                paciente2,
                java.time.LocalDate.of(2026, 8, 25),
                200.00
        );

        consulta2.exibirComprovante();

        System.out.println();

        consulta1.remarcar(java.time.LocalDate.of(2026, 8, 22));
    }
}