public class Funcionario {

    private String nome;
    private double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    double salarioDoMes() {
        return salario;
    }

    void aumentarSalario(double percentual) {
        salario = salario + salario * percentual / 100;
    }
}