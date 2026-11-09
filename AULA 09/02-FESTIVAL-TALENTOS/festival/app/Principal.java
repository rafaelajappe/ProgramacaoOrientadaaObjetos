package app;

import modelo.Cantor;
import modelo.Dancarino;
import modelo.Comediante;
import modelo.Magico;
import modelo.Programacao;

public class Principal {
    public static void main(String[] args) {
        Programacao programacao = new Programacao();

        programacao.registrar(new Cantor("Ana", "8º ano", "Imagine", 4));
        programacao.registrar(new Dancarino("Bruno", "9º ano", "Hip-hop", 5));
        programacao.registrar(new Comediante("Carla", "8º ano", "Vida escolar", 6));
        programacao.registrar(new Magico("Diego", "9º ano", "Cartas", 3));

        System.out.println("PROGRAMAÇÃO DO FESTIVAL");
        programacao.listarApresentacoes();

        System.out.println("Duração total: "
                + programacao.calcularDuracaoTotal() + " minutos");
    }
}
