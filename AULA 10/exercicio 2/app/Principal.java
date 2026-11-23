
package app;

import modelo.Aluno;
import modelo.GeradorDeBoletim;
import saidas.SaidaConsole;
import saidas.SaidaArquivo;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        // Primeiro aluno
        Aluno aluno1 = new Aluno(
                "Maria",
                Arrays.asList(8.0, 7.0, 9.0)
        );

        // Boletim no console
        GeradorDeBoletim geradorConsole =
                new GeradorDeBoletim(new SaidaConsole());

        geradorConsole.gerar(aluno1);


        System.out.println("--------------------------");


        // Segundo aluno
        Aluno aluno2 = new Aluno(
                "Joao",
                Arrays.asList(5.0, 6.0, 7.0)
        );

        // Boletim no arquivo
        GeradorDeBoletim geradorArquivo =
                new GeradorDeBoletim(new SaidaArquivo());

        geradorArquivo.gerar(aluno2);

    }

}

