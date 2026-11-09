package app;

import modelo.Veterinario;
import modelo.Tosador;
import modelo.Recepcionista;
import modelo.Estagiario;

public class Principal {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();
        Tosador tosador = new Tosador();
        Recepcionista recepcionista = new Recepcionista();
        Estagiario estagiario = new Estagiario();

        System.out.println("VETERINÁRIO");
        veterinario.consultar("Rex");
        veterinario.vacinar("Rex");
        veterinario.operar("Rex");

        System.out.println();

        System.out.println("TOSADOR");
        tosador.fazerTosa("Mel");
        tosador.darBanho("Mel");

        System.out.println();

        System.out.println("RECEPCIONISTA");
        recepcionista.agendarConsulta("João");
        recepcionista.emitirRecibo("João");

        System.out.println();

        System.out.println("ESTAGIÁRIO");
        estagiario.agendarConsulta("Maria");
        estagiario.darBanho("Luna");
    }
}
