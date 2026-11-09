package modelo;

import interfaces.Apresentavel;

public class Dancarino implements Apresentavel {
    private String nome;
    private String turma;
    private String estilo;
    private int duracaoMinutos;

    public Dancarino(String nome, String turma, String estilo, int duracaoMinutos) {
        this.nome = nome;
        this.turma = turma;
        this.estilo = estilo;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void apresentar() {
        System.out.println("Dançarino: " + nome + " | Turma: " + turma
                + " | Estilo: " + estilo + " | Duração: " + duracaoMinutos + " min");
    }

    @Override
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
