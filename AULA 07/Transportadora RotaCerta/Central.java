import java.util.ArrayList;

public class Central {

    private ArrayList<Encomenda> encomendas;

    public Central() {
        encomendas = new ArrayList<>();
    }

    public void adicionarEncomenda(Encomenda encomenda) {

        for (Encomenda e : encomendas) {

            if (e.getCodigo().equals(encomenda.getCodigo())) {

                throw new CodigoRepetidoException(
                    "O código " + encomenda.getCodigo()
                    + " já está cadastrado."
                );
            }
        }

        encomendas.add(encomenda);
    }

    public void entregar(String codigo) {

        for (int i = 0; i < encomendas.size(); i++) {

            if (encomendas.get(i).getCodigo().equals(codigo)) {

                encomendas.remove(i);

                System.out.println(
                    "Encomenda " + codigo
                    + " entregue com sucesso."
                );

                return;
            }
        }

        throw new CodigoNaoEncontradoException(
            "Código " + codigo + " não encontrado."
        );
    }

    public double freteTotal() {

        double total = 0;

        for (Encomenda e : encomendas) {
            total = total + e.calcularFrete();
        }

        return total;
    }

    public Encomenda encomendaMaisPesada() {

        Encomenda maior = null;

        for (Encomenda e : encomendas) {

            if (maior == null ||
                e.getPeso() > maior.getPeso()) {

                maior = e;
            }
        }

        return maior;
    }

    public int quantidadeNormais() {

        int quantidade = 0;

        for (Encomenda e : encomendas) {

            if (e instanceof EncomendaNormal) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public int quantidadeExpressas() {

        int quantidade = 0;

        for (Encomenda e : encomendas) {

            if (e instanceof EncomendaExpressa) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public int quantidadeFrageis() {

        int quantidade = 0;

        for (Encomenda e : encomendas) {

            if (e instanceof EncomendaFragil) {
                quantidade++;
            }
        }

        return quantidade;
    }
}