public class Gerente extends Funcionario {

    private double bonus;

    Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    double salarioDoMes() {
        return getSalario() + bonus;
    }
}
