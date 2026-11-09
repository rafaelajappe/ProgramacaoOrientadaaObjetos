package modelo;

import interfaces.Apresentavel;

public class Comediante implements Apresentavel {
    private String nome;
    private String turma;
    private String tema;
    private int duracaoMinutos;

    public Comediante(String nome, String turma, String tema, int duracaoMinutos) {
        this.nome = nome;
        this.turma = turma;
        this.tema = tema;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void apresentar() {
        System.out.println("Comediante: " + nome + " | Turma: " + turma
                + " | Tema: " + tema + " | Duração: " + duracaoMinutos + " min");
    }

    @Override
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
