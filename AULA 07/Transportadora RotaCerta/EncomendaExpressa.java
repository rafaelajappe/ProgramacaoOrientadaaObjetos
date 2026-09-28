public class EncomendaExpressa extends Encomenda {

    public EncomendaExpressa(
            String codigo,
            String destinatario,
            double peso) {

        super(codigo, destinatario, peso);

        if (peso > 10) {
            throw new PesoExpressaInvalidoException(
                "Encomenda expressa não pode ter mais de 10 kg."
            );
        }
    }

    @Override
    public double calcularFrete() {
        return getPeso() * 1.20 + 15;
    }
}