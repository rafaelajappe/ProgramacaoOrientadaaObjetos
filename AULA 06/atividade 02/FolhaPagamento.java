import java.util.ArrayList;

public class FolhaPagamento {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    void contratar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    double fecharFolha() {

        double total = 0;

        for (Funcionario funcionario : funcionarios) {
            total = total + funcionario.salarioDoMes();
        }

        return total;
    }

    void aumentoGeral(double percentual) {

        for (Funcionario funcionario : funcionarios) {
            funcionario.aumentarSalario(percentual);
        }
    }
}