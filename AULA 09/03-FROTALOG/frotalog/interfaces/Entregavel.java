package interfaces;

public interface Entregavel {
    boolean podeRealizarEntrega(double distanciaKm);
    double calcularCusto(double distanciaKm);
    String getDescricao();
}
