
package modelo;

import java.util.List;

public class Aluno {

    private String nome;
    private List<Double> notas;

    public Aluno(String nome, List<Double> notas) {

        this.nome = nome;
        this.notas = notas;

    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

}
