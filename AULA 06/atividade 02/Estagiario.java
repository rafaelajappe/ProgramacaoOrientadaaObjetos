public class Estagiario extends Funcionario {

    private double horasSemanais;

    Estagiario(String nome, double salario, double horasSemanais) {
        super(nome, salario);
        this.horasSemanais = horasSemanais;
    }

    @Override
    double salarioDoMes() {
        return getSalario() * horasSemanais / 40;
    }
}