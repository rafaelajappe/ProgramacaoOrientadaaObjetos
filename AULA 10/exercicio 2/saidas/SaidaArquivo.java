
package saidas;

import interfaces.SaidaBoletim;
import java.io.FileWriter;
import java.io.IOException;

public class SaidaArquivo implements SaidaBoletim {

    @Override
    public void exibir(String conteudo) {

        try {

            FileWriter arquivo = new FileWriter("boletim.txt");

            arquivo.write(conteudo);

            arquivo.close();

            System.out.println("Boletim salvo com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro ao salvar o boletim!");

        }

    }

}

