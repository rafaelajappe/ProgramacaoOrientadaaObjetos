
package saidas;

import interfaces.SaidaBoletim;

public class SaidaConsole implements SaidaBoletim {

    @Override
    public void exibir(String conteudo) {

        System.out.println(conteudo);

    }

}

