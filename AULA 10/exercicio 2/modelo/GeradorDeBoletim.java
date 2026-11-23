
package modelo;

import interfaces.SaidaBoletim;

public class GeradorDeBoletim {

    private SaidaBoletim saida;

    public GeradorDeBoletim(SaidaBoletim saida) {

        this.saida = saida;

    }

    public void gerar(Aluno aluno) {

        double soma = 0;

        for (double nota : aluno.getNotas()) {

            soma = soma + nota;

        }

        double media = soma / aluno.getNotas().size();

        String situacao;

        if (media >= 7) {

            situacao = "Aprovado";

        } else {

            situacao = "Reprovado";

        }

        String conteudo =
                "BOLETIM ESCOLAR\n" +
                "Aluno: " + aluno.getNome() + "\n" +
                "Notas: " + aluno.getNotas() + "\n" +
                "Media: " + media + "\n" +
                "Situacao: " + situacao;

        saida.exibir(conteudo);

    }

}
