public class EncomendaFragil extends Encomenda {

    public EncomendaFragil(
            String codigo,
            String destinatario,
            double peso) {

        super(codigo, destinatario, peso);
    }

    @Override
    public double calcularFrete() {
        return (getPeso() * 1.20) + (getPeso() * 0.80);
    }
}