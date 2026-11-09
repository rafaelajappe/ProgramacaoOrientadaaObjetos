package modelo;

public abstract class Veiculo {
    private String placa;
    private double capacidadeKg;

    public Veiculo(String placa, double capacidadeKg) {
        this.placa = placa;
        this.capacidadeKg = capacidadeKg;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidadeKg() {
        return capacidadeKg;
    }
}
