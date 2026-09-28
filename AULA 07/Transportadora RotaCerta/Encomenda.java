public class Encomenda {

    private String codigo;
    private String destinatario;
    private double peso;

    public Encomenda(String codigo, String destinatario, double peso) {

        if (peso <= 0) {
            throw new IllegalArgumentException(
                "O peso deve ser maior que zero."
            );
        }

        this.codigo = codigo;
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public double getPeso() {
        return peso;
    }

    public double calcularFrete() {
        return peso * 1.20;
    }
}
