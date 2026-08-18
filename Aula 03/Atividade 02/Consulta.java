public class Consulta {
    Paciente paciente;
    java.time.LocalDate data;
    double valor;

    Consulta(Paciente paciente, java.time.LocalDate data, double valor) {
        this.paciente = paciente;
        this.data = data;
        this.valor = valor;
    }

    void exibirComprovante() {
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Telefone: " + paciente.telefone);
        System.out.println("Data da consulta: " + data);
        System.out.println("Valor: R$ " + valor);
    }

    void remarcar(java.time.LocalDate novaData) {
        data = novaData;
        System.out.println("Consulta remarcada para: " + data);
    }
}