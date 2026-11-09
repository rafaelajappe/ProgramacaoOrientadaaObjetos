package modelo;

import java.util.ArrayList;
import interfaces.Apresentavel;

public class Programacao {
    private ArrayList<Apresentavel> apresentacoes = new ArrayList<>();

    public void registrar(Apresentavel apresentacao) {
        apresentacoes.add(apresentacao);
    }

    public void listarApresentacoes() {
        for (Apresentavel apresentacao : apresentacoes) {
            apresentacao.apresentar();
        }
    }

    public int calcularDuracaoTotal() {
        int total = 0;

        for (Apresentavel apresentacao : apresentacoes) {
            total += apresentacao.getDuracaoMinutos();
        }

        return total;
    }
}
