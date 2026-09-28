import java.util.ArrayList;

public class Academia {

    private ArrayList<Matricula> matriculas;
    private int[] checkins;

    public Academia() {
        matriculas = new ArrayList<>();
        checkins = new int[7];
    }

    public void adicionarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }

    public void registrarCheckin(int dia) {

        if (dia < 0 || dia > 6) {
            throw new IllegalArgumentException(
                "O dia deve estar entre 0 e 6."
            );
        }

        checkins[dia]++;
    }

    public double receitaMensalTotal() {

        double total = 0;

        for (Matricula m : matriculas) {
            total = total + m.calcularMensalidade();
        }

        return total;
    }

    public Matricula matriculaMaisCara() {

        Matricula maior = null;

        for (Matricula m : matriculas) {

            if (maior == null ||
                m.calcularMensalidade() > maior.calcularMensalidade()) {

                maior = m;
            }
        }

        return maior;
    }

    public int diaMaisMovimentado() {

        int maiorDia = 0;

        for (int i = 1; i < checkins.length; i++) {

            if (checkins[i] > checkins[maiorDia]) {
                maiorDia = i;
            }
        }

        return maiorDia;
    }
}