
package modelo;

public class Pagamento {

    private double valor;
    private String descricao;
    private String data;

    public Pagamento(double valor, String descricao, String data) {

        this.valor = valor;
        this.descricao = descricao;
        this.data = data;

    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

}
