package modelo;

import interfaces.Apresentavel;

public class Cantor implements Apresentavel {
    private String nome;
    private String turma;
    private String musica;
    private int duracaoMinutos;

    public Cantor(String nome, String turma, String musica, int duracaoMinutos) {
        this.nome = nome;
        this.turma = turma;
        this.musica = musica;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void apresentar() {
        System.out.println("Cantor: " + nome + " | Turma: " + turma
                + " | Música: " + musica + " | Duração: " + duracaoMinutos + " min");
    }

    @Override
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
