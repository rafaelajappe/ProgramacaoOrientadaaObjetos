package modelo;

import interfaces.Apresentavel;

// Classe extra para demonstrar o desafio do professor.
public class Magico implements Apresentavel {
    private String nome;
    private String turma;
    private String truque;
    private int duracaoMinutos;

    public Magico(String nome, String turma, String truque, int duracaoMinutos) {
        this.nome = nome;
        this.turma = turma;
        this.truque = truque;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void apresentar() {
        System.out.println("Mágico: " + nome + " | Turma: " + turma
                + " | Truque: " + truque + " | Duração: " + duracaoMinutos + " min");
    }

    @Override
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
