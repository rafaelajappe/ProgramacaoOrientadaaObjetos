
package logs;

import interfaces.Log;

public class LogConsole implements Log {

    @Override
    public void registrar(String mensagem) {

        System.out.println(mensagem);

    }

}
